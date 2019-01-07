package com.dhcs.userinterface.systemadminworkarea;

import com.dhcs.business.DecentralizedHealthCareSystem;
import com.dhcs.business.employee.Employee;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.network.Network;
import com.dhcs.business.role.AdminRole;
import com.dhcs.business.role.HospitalRole;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.utility.DHCSHelper;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author shivesh
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DecentralizedHealthCareSystem system;
    private DHCSHelper dHCSHelper;
    private Network network;
    private static final Logger logger = Logger.getLogger(ManageEnterpriseAdminJPanel.class);
    /**
     * Creates new form ManageEnterpriseJPanel
     * @param userProcessContainer
     * @param system
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, DecentralizedHealthCareSystem system) {
       
        initComponents();
        dHCSHelper = new DHCSHelper();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18))); 
        enterpriseJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network networkItem : system.getNetworkList()) {
            for (Enterprise enterprise : networkItem.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = networkItem.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network networkPresent : system.getNetworkList()){
            networkJComboBox.addItem(networkPresent);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        emailAddressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N

        enterpriseJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setRowHeight(25);
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 33, 1180, 140));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 130, -1));

        networkJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 609, 45));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, -1, -1));

        usernameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 609, 45));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 140, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 609, 45));

        submitJButton.setBackground(new java.awt.Color(0, 153, 0));
        submitJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(null);
        submitJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitJButton.setRolloverEnabled(false);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 820, 300, 60));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 750, -1, -1));

        nameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 609, 45));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));

        passwordJPasswordField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 730, 609, 45));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        backJButton.setText(" Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.setRolloverEnabled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 820, 300, 60));

        emailAddressJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(emailAddressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 609, 45));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Email Id");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, -1, -1));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/enterprise-admin.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String name = nameJTextField.getText();
        String username = usernameJTextField.getText();
        String password = passwordJPasswordField.getText();
        String email = emailAddressJTextField.getText();
        
        if(dHCSHelper.validInput(DHCSHelper.emailRegEx, email)){
       
            if(!username.trim().isEmpty() && !String.valueOf(password).trim().isEmpty() && !name.trim().isEmpty()
                    && enterprise != null && network != null){
                
                boolean emailFlag =  enterprise.getUserAccountDirectory().checkIfEmailIdIsUnique(email);
                boolean userFlag = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                if(emailFlag && userFlag) {
                    
                    Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
                    UserAccount account;
                    if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)) {
                        account = enterprise.getUserAccountDirectory().createUserAccount(username, password,email, employee, new HospitalRole());
                    } else {
                       account = enterprise.getUserAccountDirectory().createUserAccount(username, password, email, employee, new AdminRole());
                    }
                    populateTable();
                    JOptionPane.showMessageDialog(this, nameJTextField.getText()+" admin created successfully.",
                    "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
                    logger.debug("Admin created successfully:"+enterprise.getUserAccountDirectory().getUserAccountList());
                    usernameJTextField.setText("");
                    passwordJPasswordField.setText("");
                    nameJTextField.setText("");
                    emailAddressJTextField.setText("");

                } else {
                    
                   if(!userFlag){
                        JOptionPane.showMessageDialog(this, "User already exists",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                        logger.debug("User already exists:");
                    }else if(!emailFlag){
                        JOptionPane.showMessageDialog(this, "Email Id is already registered with Enterprise",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                        logger.debug("Email Id is already registered with Enterprise"+enterprise.getUserAccountDirectory());
                     }
                }
            }else{
                JOptionPane.showMessageDialog(this, "All fields are mandatory!",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                logger.debug("Fill in all the fields");
            }
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField emailAddressJTextField;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
