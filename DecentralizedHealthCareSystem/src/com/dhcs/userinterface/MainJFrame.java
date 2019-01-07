package com.dhcs.userinterface;

import com.dhcs.business.DecentralizedHealthCareSystem;
import com.dhcs.business.db4util.DB4OUtil;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.network.Network;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Shivesh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private DecentralizedHealthCareSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private static final Logger logger = Logger.getLogger(MainJFrame.class);
    static final String path = "src/com/dhcs/properties/log4j.properties";
    
    private ImageIcon iconLogo;
    //private  JOptionPane option;



    public MainJFrame() {
        super("Java SlideShow");
        initComponents();
        system = dB4OUtil.retrieveSystem();
              
        iconLogo = new ImageIcon("src/com/dhcs/util/image/lock.png");
        loginImageLabel.setIcon(iconLogo);
       
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));       
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        MainjSplitPane1 = new javax.swing.JSplitPane();
        LoginJPanel1 = new javax.swing.JPanel();
        loginJButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        loginJLabel1 = new javax.swing.JLabel();
        logoutJButton1 = new javax.swing.JButton();
        loginImageLabel1 = new javax.swing.JLabel();
        container1 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        MainjSplitPane = new javax.swing.JSplitPane();
        LoginJPanel = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        loginImageLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Decentralized Health Care System");
        jFrame1.setName("MainFrame"); // NOI18N

        MainjSplitPane1.setDividerLocation(360);
        MainjSplitPane1.setDividerSize(1);

        LoginJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        LoginJPanel1.setPreferredSize(new java.awt.Dimension(403, 800));

        loginJButton1.setBackground(new java.awt.Color(0, 153, 51));
        loginJButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginJButton1.setText("Login");
        loginJButton1.setBorder(null);
        loginJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("User Name");

        userNameJTextField1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        userNameJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextField1ActionPerformed(evt);
            }
        });

        passwordField1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        logoutJButton1.setBackground(new java.awt.Color(0, 102, 102));
        logoutJButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        logoutJButton1.setText("Logout");
        logoutJButton1.setBorder(null);
        logoutJButton1.setEnabled(false);
        logoutJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginJPanel1Layout = new javax.swing.GroupLayout(LoginJPanel1);
        LoginJPanel1.setLayout(LoginJPanel1Layout);
        LoginJPanel1Layout.setHorizontalGroup(
            LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginJPanel1Layout.createSequentialGroup()
                        .addGroup(LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userNameJTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logoutJButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(loginJButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField1, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(78, 78, 78)
                        .addComponent(loginJLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginJPanel1Layout.setVerticalGroup(
            LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJPanel1Layout.createSequentialGroup()
                .addGroup(LoginJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginJPanel1Layout.createSequentialGroup()
                        .addGap(705, 705, 705)
                        .addComponent(loginJLabel1))
                    .addGroup(LoginJPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(loginJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainjSplitPane1.setLeftComponent(LoginJPanel1);

        container1.setBackground(new java.awt.Color(255, 255, 255));
        container1.setLayout(new java.awt.CardLayout());
        container1.add(pic1, "card2");

        MainjSplitPane1.setRightComponent(container1);

        jFrame1.getContentPane().add(MainjSplitPane1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Decentralized Health Care System");
        setName("MainFrame"); // NOI18N

        MainjSplitPane.setDividerLocation(360);
        MainjSplitPane.setDividerSize(1);

        LoginJPanel.setBackground(new java.awt.Color(0, 0, 0));
        LoginJPanel.setPreferredSize(new java.awt.Dimension(403, 800));

        loginJButton.setBackground(new java.awt.Color(0, 153, 51));
        loginJButton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.setBorder(null);
        loginJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        userNameJTextField.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });
        userNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameJTextFieldFocusGained(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        logoutJButton.setBackground(new java.awt.Color(0, 102, 102));
        logoutJButton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setBorder(null);
        logoutJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginJPanelLayout = new javax.swing.GroupLayout(LoginJPanel);
        LoginJPanel.setLayout(LoginJPanelLayout);
        LoginJPanelLayout.setHorizontalGroup(
            LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginJPanelLayout.createSequentialGroup()
                        .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logoutJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(loginJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(78, 78, 78)
                        .addComponent(loginJLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginJPanelLayout.setVerticalGroup(
            LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJPanelLayout.createSequentialGroup()
                .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginJPanelLayout.createSequentialGroup()
                        .addGap(705, 705, 705)
                        .addComponent(loginJLabel))
                    .addGroup(LoginJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        MainjSplitPane.setLeftComponent(LoginJPanel);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/DHCS6.jpg"))); // NOI18N
        pic.setMaximumSize(new java.awt.Dimension(1800, 1000));
        pic.setMinimumSize(new java.awt.Dimension(1800, 1000));
        pic.setName(""); // NOI18N
        pic.setPreferredSize(new java.awt.Dimension(1800, 1000));
        pic.setRequestFocusEnabled(false);
        pic.setVerifyInputWhenFocusTarget(false);
        container.add(pic, "card2");

        MainjSplitPane.setRightComponent(container);

        getContentPane().add(MainjSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        logger.info("Logged in from Ecosystem Admin Screen");
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        ArrayList<Enterprise> enterpriseList = null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials, Please try again","Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            userNameJTextField.setText("");
            passwordField.setText("");
            logger.error("User credentials mismatched");

            return;
        }
        else{
            iconLogo = new ImageIcon("src/com/dhcs/util/image/unlock.png");
            loginImageLabel.setIcon(iconLogo);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, 
                    inEnterprise, system, enterpriseList));
            layout.next(container);
            logger.debug("User successfully logged in, user role: {}" + userAccount.getRole());
        }
        
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        iconLogo = new ImageIcon("src/com/dhcs/util/image/lock.png");
        loginImageLabel.setIcon(iconLogo);
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        logger.info("User successfully logged out");
        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        container.add("Home Page", pic);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginJButton1ActionPerformed

    private void userNameJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextField1ActionPerformed

    private void logoutJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutJButton1ActionPerformed

    private void userNameJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameJTextFieldFocusGained
        userNameJTextField.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_userNameJTextFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setBackground(Color.lightGray);
    }//GEN-LAST:event_passwordFieldFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        PropertyConfigurator.configure(path);
        logger.info("------------------Inside MainJFrame--------------------");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginJPanel;
    private javax.swing.JPanel LoginJPanel1;
    private javax.swing.JSplitPane MainjSplitPane;
    private javax.swing.JSplitPane MainjSplitPane1;
    private javax.swing.JPanel container;
    private javax.swing.JPanel container1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel loginImageLabel;
    private javax.swing.JLabel loginImageLabel1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton loginJButton1;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JLabel loginJLabel1;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton logoutJButton1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel pic1;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JTextField userNameJTextField1;
    // End of variables declaration//GEN-END:variables
}
