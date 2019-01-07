package com.dhcs.userinterface.role.labassistant;

import com.dhcs.business.organization.LabOrganization;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.business.workqueue.LabTestWorkRequest;
import com.dhcs.business.workqueue.WorkRequest;
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
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private static final Logger logger = Logger.getLogger(LabAssistantWorkAreaJPanel.class);
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, 
            Organization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.labOrganization = (LabOrganization)organization;
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));
        workRequestJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        processJButton.setEnabled(false);
         workRequestJTable.removeColumn(workRequestJTable.getColumnModel().getColumn(0));
        populateTable();
        buttonEnabled();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getMessage();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            
            model.addRow(row);
        }
    }
     private void buttonEnabled() {
         int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            assignJButton.setEnabled(false);
        }
    }
    public void populateCheckBoxes() {
       
        for(WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()){
           LabTestWorkRequest rq = (LabTestWorkRequest)request;
           rbcCheckBox.setSelected(rq.getBooleanMap().get(rbcCheckBox.getText()));
           glCheckBox.setSelected(rq.getBooleanMap().get(glCheckBox.getText()));
           triCheckBox.setSelected(rq.getBooleanMap().get(triCheckBox.getText()));
           proCheckBox.setSelected(rq.getBooleanMap().get(proCheckBox.getText()));
           choCheckBox.setSelected(rq.getBooleanMap().get(choCheckBox.getText()));
           sugarCheckBox.setSelected(rq.getBooleanMap().get(sugarCheckBox.getText()));
           diaCheckBox.setSelected(rq.getBooleanMap().get(diaCheckBox.getText()));
           nauCheckBox.setSelected(rq.getBooleanMap().get(nauCheckBox.getText()));
           fatCheckBox.setSelected(rq.getBooleanMap().get(fatCheckBox.getText()));
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbcCheckBox = new javax.swing.JCheckBox();
        glCheckBox = new javax.swing.JCheckBox();
        triCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        proCheckBox = new javax.swing.JCheckBox();
        choCheckBox = new javax.swing.JCheckBox();
        sugarCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        diaCheckBox = new javax.swing.JCheckBox();
        nauCheckBox = new javax.swing.JCheckBox();
        fatCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request", "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(25);
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 1090, 130));

        assignJButton.setBackground(new java.awt.Color(204, 0, 0));
        assignJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(null);
        assignJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 300, 60));

        processJButton.setBackground(new java.awt.Color(0, 153, 51));
        processJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        processJButton.setText("Process");
        processJButton.setBorder(null);
        processJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 780, 300, 60));

        refreshJButton.setBackground(new java.awt.Color(102, 102, 0));
        refreshJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(null);
        refreshJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, 120, 40));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Blood");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 120, 40));

        rbcCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        rbcCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        rbcCheckBox.setText("RBC");
        rbcCheckBox.setEnabled(false);
        add(rbcCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 150, -1));

        glCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        glCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        glCheckBox.setText("Glucose");
        glCheckBox.setEnabled(false);
        add(glCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 160, -1));

        triCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        triCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        triCheckBox.setText("Triglycerides");
        triCheckBox.setEnabled(false);
        add(triCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Urine");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 120, 40));

        proCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        proCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        proCheckBox.setText("Protein");
        proCheckBox.setEnabled(false);
        add(proCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 150, -1));

        choCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        choCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        choCheckBox.setText("Cholesterol");
        choCheckBox.setEnabled(false);
        add(choCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, -1, -1));

        sugarCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        sugarCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        sugarCheckBox.setText("Sugar");
        sugarCheckBox.setEnabled(false);
        add(sugarCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 170, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stool");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 120, 40));

        diaCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        diaCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        diaCheckBox.setText("Diarrhoea");
        diaCheckBox.setEnabled(false);
        add(diaCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 150, -1));

        nauCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        nauCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        nauCheckBox.setText("Nausea");
        nauCheckBox.setEnabled(false);
        add(nauCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 160, -1));

        fatCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        fatCheckBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        fatCheckBox.setText("Fatigue");
        fatCheckBox.setEnabled(false);
        add(fatCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 610, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jButton1.setText("show requested test");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 240, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 700, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/lab_test.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a request to add ",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getModel().getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        logger.info("Lab Receiver:"+userAccount.getUsername());
        processJButton.setEnabled(true);
        populateTable();
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a request to process ",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getModel().getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,
                labOrganization, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        processJButton.setEnabled(false);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         assignJButton.setEnabled(true);
        populateCheckBoxes();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JCheckBox choCheckBox;
    private javax.swing.JCheckBox diaCheckBox;
    private javax.swing.JCheckBox fatCheckBox;
    private javax.swing.JCheckBox glCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox nauCheckBox;
    private javax.swing.JCheckBox proCheckBox;
    private javax.swing.JButton processJButton;
    private javax.swing.JCheckBox rbcCheckBox;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JCheckBox sugarCheckBox;
    private javax.swing.JCheckBox triCheckBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

   
}
