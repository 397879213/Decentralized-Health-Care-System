package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.doctor.Doctor;
import com.dhcs.business.employee.Employee;
import com.dhcs.business.organization.DoctorOrganization;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.organization.OrganizationDirectory;
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
 * @author shivesh
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private static final Logger logger = Logger.getLogger(ManageEmployeeJPanel.class);
    /**
     * Creates new form ManageOrganizationJPanel
     * @param userProcessContainer
     * @param organizationDir
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        organizationJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        doctorJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));
        if(!organizationDir.getOrganizationList().isEmpty() && organizationDir.getOrganizationList().size()==2){
            populateTable(organizationDir.getOrganizationList().get(0));
            populateTable(organizationDir.getOrganizationList().get(1));
        }
        populateOrganizationComboBox();
    }
    
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationJComboBox.addItem(organization);
        }
    }


    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }
    
    //Populate Doctor Table
    private void populateDoctorTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) doctorJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            Doctor doc = (Doctor) employee;
            row[0] = doc.getId();
            row[1] = doc.getName();
            row[2] = doc.getSpec();
            model.addRow(row);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        organizationJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 22)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setRowHeight(25);
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 900, 140));

        addJButton.setBackground(new java.awt.Color(163, 19, 40));
        addJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.setBorder(null);
        addJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 800, 300, 60));

        organizationJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 470, 50));

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backJButton.setText(" Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 800, 300, 60));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, 50));

        nameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 270, 50));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, -1, 50));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        doctorJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 22)); // NOI18N
        doctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Speciality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        doctorJTable.setRowHeight(25);
        jScrollPane2.setViewportView(doctorJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 890, 140));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Doctor Organization");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 240, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Lab Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 220, -1));

        jLabel6.setText("*Medical Council Responsible for Doctors");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 304, 37));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 22)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/hos-subpanel.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
       
        if(!name.trim().isEmpty()){
            if(organization.getEmployeeDirectory().checkIfUsernameIsUnique(name)) {
                organization.getEmployeeDirectory().createEmployee(name);
                nameJTextField.setText("");
                populateTable(organization);
                JOptionPane.showMessageDialog(this,"Employee "+nameJTextField.getText()+ " created successfully",
                    "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
            } else {
                logger.debug("User Name already exists");
                JOptionPane.showMessageDialog(this,"User name "+nameJTextField.getText()+" already exists",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please enter a valid name!",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            
            if(!(organization instanceof DoctorOrganization)){
                 nameJTextField.setEditable(true);
                addJButton.setEnabled(true);
                populateTable(organization);
            } else {
                nameJTextField.setEditable(false);
                addJButton.setEnabled(false);
                populateDoctorTable(organization);
            }
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable doctorJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
