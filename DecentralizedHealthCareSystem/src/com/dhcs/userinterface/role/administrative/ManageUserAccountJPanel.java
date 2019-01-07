package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.employee.Employee;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.role.Role;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.utility.DHCSHelper;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
/**
 *
 * @author Shivesh
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private DHCSHelper dHCSHelper;
    private static final Logger logger = Logger.getLogger(ManageUserAccountJPanel.class);
    
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        dHCSHelper = new DHCSHelper();
        this.enterprise = enterprise;
        this.container = container;
        popOrganizationComboBox();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));  
        userJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        userJTable.removeColumn(userJTable.getColumnModel().getColumn(1));
        popData();
        
    }
    
   
     
    private void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                if(organization.getName().startsWith(Organization.Type.Lab.toString())){
                    organizationJComboBox.addItem(organization);
                }
             }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                if(organization.getName().startsWith(Organization.Type.Doctor.toString())){
                    organizationJComboBox.addItem(organization);
                }
            } else {
               
                    organizationJComboBox.addItem(organization);
                
            }
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        roleJComboBox.setVisible(false);
        roleJLabel.setVisible(false);
        
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    private void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getRole();
                row[2] = organization.getName();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        roleJLabel = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        passwordJTextField = new javax.swing.JPasswordField();
        resetUserPwdJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        emailAddressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setBackground(new java.awt.Color(51, 102, 0));
        createUserJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        createUserJButton.setText("Create User");
        createUserJButton.setBorder(null);
        createUserJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 790, 300, 60));

        nameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        nameJTextField.setBorder(null);
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 500, 55));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        userJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Name", "Role", "Organization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setRowHeight(25);
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
            userJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 45, 1106, 159));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 130, -1));

        employeeJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 300, 55));

        backjButton1.setBackground(new java.awt.Color(0, 102, 102));
        backjButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backjButton1.setText("Back");
        backjButton1.setBorder(null);
        backjButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 800, 300, 60));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        organizationJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 370, 55));

        roleJLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        roleJLabel.setForeground(new java.awt.Color(102, 0, 51));
        roleJLabel.setText("Role");
        add(roleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 70, -1));

        roleJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 300, 55));

        passwordJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        passwordJTextField.setBorder(null);
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 500, 55));

        resetUserPwdJButton.setBackground(new java.awt.Color(153, 0, 51));
        resetUserPwdJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        resetUserPwdJButton.setText("Reset User Password");
        resetUserPwdJButton.setBorder(null);
        resetUserPwdJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetUserPwdJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetUserPwdJButtonActionPerformed(evt);
            }
        });
        add(resetUserPwdJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 900, 306, 60));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel4.setText("Email Id");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        emailAddressJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        emailAddressJTextField.setBorder(null);
        add(emailAddressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 500, 55));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/hos-subpanel.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents
    private boolean isComboBoxNull(Organization organization, Employee employee, Role role){
        
        return organization != null && employee != null && role != null;
    }
    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        String email =  emailAddressJTextField.getText();
        
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        
        if(isComboBoxNull(organization,employee,role) && !userName.trim().isEmpty() && !password.trim().isEmpty() && !email.trim().isEmpty()){
            
                if(dHCSHelper.validInput(DHCSHelper.emailRegEx, email)){
                    
                    boolean emailFlag = organization.getUserAccountDirectory().checkIfEmailIdIsUnique(email);
                    boolean userFlag = organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                    boolean empFlag = organization.getUserAccountDirectory().isEmployeeExist(employee);

                    if(userFlag && emailFlag && !empFlag) {

                        organization.getUserAccountDirectory().createUserAccount(userName, password,email,employee, role); 
                        popData();
                        JOptionPane.showMessageDialog(this, "User created successfully.",
                                "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
                        logger.debug("User created successfully");
                        nameJTextField.setText("");
                        passwordJTextField.setText("");
                        emailAddressJTextField.setText("");

                    }
                    else {
                        if(!userFlag){
                            logger.debug("User already exists");
                            JOptionPane.showMessageDialog(this, "User already exists",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                             nameJTextField.setText("");
                             passwordJTextField.setText("");
                             emailAddressJTextField.setText("");
                        }else if(!emailFlag){
                            logger.debug("Email registered with enterprise");
                            JOptionPane.showMessageDialog(this, "Email Id already registered with Enterprise",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                             nameJTextField.setText("");
                             passwordJTextField.setText("");
                             emailAddressJTextField.setText("");
                             
                        }else if(empFlag){
                            logger.debug("Employee already registered with enterprise");
                            JOptionPane.showMessageDialog(this, "Employee already registered with enterprise",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                             nameJTextField.setText("");
                             passwordJTextField.setText("");
                             emailAddressJTextField.setText("");
                        }
                    }
                }else{
                    logger.debug("Email format incorrect");
                   JOptionPane.showMessageDialog(this, "Incorrect email format!",
                           "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                }
        }else{
            logger.debug("Missing Fields");
            JOptionPane.showMessageDialog(this, "All fields are mandatory !", 
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed
    

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed


    
    private void resetUserPwdJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetUserPwdJButtonActionPerformed
        
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        PasswordResetPanel passwordResetPanel = new PasswordResetPanel(container,organization);
        container.add("PasswordResetPanel",passwordResetPanel);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_resetUserPwdJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JTextField emailAddressJTextField;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JButton resetUserPwdJButton;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables

   
}
