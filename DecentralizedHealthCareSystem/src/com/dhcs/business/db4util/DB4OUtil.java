package com.dhcs.business.db4util;

import com.dhcs.business.DecentralizedHealthCareSystemConfiguration;
import com.dhcs.business.DecentralizedHealthCareSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author rrheg
 * @author Lingfeng
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(DecentralizedHealthCareSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(DecentralizedHealthCareSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public DecentralizedHealthCareSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<DecentralizedHealthCareSystem> systems = conn.query(DecentralizedHealthCareSystem.class); // Change to the object you want to save
        DecentralizedHealthCareSystem system;
        if (systems.size() == 0){
            system = DecentralizedHealthCareSystemConfiguration.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
//        ObjectSet result= conn.queryByExample(DecentralizedHealthCareSystem.class);
//        listResult(result);
        conn.close();
        return system;
    }
//    public  void listResult(ObjectSet result) {
//        System.out.println(result.size());
//        
//            while(result.hasNext()) {
//             System.out.println(result.next());
//            }
//       }
    //db.store(pilot1); --> to store object
}
