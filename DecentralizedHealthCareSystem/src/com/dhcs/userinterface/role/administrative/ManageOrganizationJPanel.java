package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.organization.Organization.Type;
import com.dhcs.business.organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Iterator;
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
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise.EnterpriseType enterpriseType;
    private static final Logger logger = Logger.getLogger(ManageOrganizationJPanel.class);
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory, Enterprise.EnterpriseType enterpriseType) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterpriseType = enterpriseType;
        organizationJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));  
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();

        if (enterpriseType.equals(Enterprise.EnterpriseType.MedicalCouncil)) {
            organizationJComboBox.addItem(Organization.Type.Doctor);
        } else if (enterpriseType.equals(Enterprise.EnterpriseType.MedicalTravelAgency)) {

            organizationJComboBox.addItem(Organization.Type.Ambulance);
            organizationJComboBox.addItem(Organization.Type.DroneAmbulance);

        } else {
            organizationJComboBox.addItem(Organization.Type.Doctor);
             organizationJComboBox.addItem(Organization.Type.Lab);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

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
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 890, 140));

        addJButton.setBackground(new java.awt.Color(163, 19, 40));
        addJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.setBorder(null);
        addJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 780, 300, 60));

        organizationJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 500, 60));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 250, 50));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 780, 300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/hos-subpanel.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Type type = (Type) organizationJComboBox.getSelectedItem();
        logger.info("Organization Type Added:"+ organizationJComboBox.getSelectedItem());
        boolean createOrganization = true;
        if(!directory.getOrganizationList().isEmpty()){
            
            Iterator<Organization> orgToAdd = directory.getOrganizationList().iterator();
             while (orgToAdd.hasNext()) {
                 if(orgToAdd.next().getName().equals(type.getValue())){
                     JOptionPane.showMessageDialog(this,type.getValue()+ " already added", 
                             "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
                     createOrganization=false;
                     break;
                 }     
                 
             }
        }
        
        if (createOrganization)
            directory.createOrganization(type);
        populateTable();
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
