package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.employee.Employee;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author shive
 */
public class ManageTravelAgencyJPanel extends javax.swing.JPanel {
    
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private ArrayList<Enterprise> enterpriseList;
    private static final Logger logger = Logger.getLogger(ManageTravelAgencyJPanel.class);

    /**
     * Creates new form ManageTravelAgencyJPanel
     */
    public ManageTravelAgencyJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir,
            ArrayList<Enterprise> enterpriseListInj) {
        
        initComponents();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));  
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.enterpriseList = enterpriseListInj;
        organizationJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        populateOrganizationComboBox();
       
    }

     public void populateOrganizationComboBox(){
        organizationTravelJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationTravelJComboBox.addItem(organization);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        organizationTravelJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setText("Organization");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 300, 55));

        organizationJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 970, 180));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setText(" Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 300, 55));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backJButton.setText(" Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.setDoubleBuffered(true);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 740, 300, 60));

        addJButton.setBackground(new java.awt.Color(51, 102, 0));
        addJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.setBorder(null);
        addJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addJButton.setDoubleBuffered(true);
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 740, 300, 60));

        nameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 510, 60));

        organizationTravelJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        organizationTravelJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationTravelJComboBoxActionPerformed(evt);
            }
        });
        add(organizationTravelJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 510, 60));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Creation Area");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 4));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setDoubleBuffered(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 670, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/manage-travel.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        
        logger.debug("Manage Travel Agency JPanel: Create Employee");
        Organization organization = (Organization) organizationTravelJComboBox.getSelectedItem();
        
        String name = nameJTextField.getText();
        if(!name.trim().isEmpty() && organization != null){
            if(organization.getEmployeeDirectory().checkIfUsernameIsUnique(name)){
                organization.getEmployeeDirectory().createEmployee(name);
                logger.debug("Organization:"+organizationTravelJComboBox.getSelectedItem());
                logger.debug("Organization Name:"+nameJTextField.getText());
                populateTable(organization);
                JOptionPane.showMessageDialog(this, "Employee "+nameJTextField.getText()+" created successfully",
                        "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
                nameJTextField.setText("");
            }else{
                logger.debug("Employee Name already exists");
                nameJTextField.setText("");
                 JOptionPane.showMessageDialog(this,"Employee name already exists",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            }
                           
            
        }else{
            JOptionPane.showMessageDialog(this, "Please enter a valid employee name and org pair",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            nameJTextField.setText("");
        }
        
    }//GEN-LAST:event_addJButtonActionPerformed
    
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
     
    private void organizationTravelJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationTravelJComboBoxActionPerformed
         Organization organization = (Organization) organizationTravelJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    
    }//GEN-LAST:event_organizationTravelJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JComboBox organizationTravelJComboBox;
    // End of variables declaration//GEN-END:variables
}
