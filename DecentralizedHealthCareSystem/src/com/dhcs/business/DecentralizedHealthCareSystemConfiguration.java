package com.dhcs.business;

import com.dhcs.business.employee.Employee;
import com.dhcs.business.role.SystemAdminRole;
import com.dhcs.business.useraccount.UserAccount;

/**
 *
 * @author shivesh
 */
public class DecentralizedHealthCareSystemConfiguration {
    
    public static DecentralizedHealthCareSystem configure(){
        
        DecentralizedHealthCareSystem system = DecentralizedHealthCareSystem.getInstance();       
        
        Employee employee = system.getEmployeeDirectory().createEmployee("SHIVESH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin","decentralizedhealthcaresystem@gmail.com",
                employee, new SystemAdminRole());
        
        return system;
    }
    
}
