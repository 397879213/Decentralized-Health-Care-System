package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.doctor.Doctor;
import com.dhcs.business.employee.Employee;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.enterprise.MedicalCouncilEnterprise;
import com.dhcs.business.organization.DoctorOrganization;
import com.dhcs.business.organization.HospitalOrganization;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.business.workqueue.HospitalWorkRequest;
import com.dhcs.business.workqueue.WorkRequest;
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
 * @author shivesh
 */
public class HospitalWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ArrayList<Enterprise> enterpriseList;
    private HospitalOrganization hospitalOrganization;
    private static final Logger logger = Logger.getLogger(HospitalWorkAreaJPanel.class);

    /**
     * Creates new form HospitalWorkAreaJPanel
     * @param userProcessContainer
     * @param enterprise
     * @param account
     * @param organizationInj
     * @param enterpriseListinj
     */
    public HospitalWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account,
            Organization organizationInj, ArrayList<Enterprise> enterpriseListinj) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.enterpriseList = enterpriseListinj;
        this.hospitalOrganization = (HospitalOrganization) organizationInj;
        
         UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));
        hospitalWorkRequestTable.removeColumn(hospitalWorkRequestTable.getColumnModel().getColumn(0));
        hospitalWorkRequestTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
       
        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) hospitalWorkRequestTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            HospitalWorkRequest hrequest = (HospitalWorkRequest) request;

            row[0] = hrequest;
            row[1] = hrequest.getSender().getUsername();
            row[2] = hrequest.getMedicalCondition();
            row[3] = hrequest.getHospitalStatus();
            //Pending, Sent to Doctor, Doctor Assigned

            row[4] = hrequest.getDoctor();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hospitalManageContainerPanel = new javax.swing.JPanel();
        manageOrganizationJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalWorkRequestTable = new javax.swing.JTable();
        ambWorkReqProcessjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("   Hospital Admin Work Panel");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 4));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 820, 80));

        hospitalManageContainerPanel.setBackground(new java.awt.Color(255, 255, 204));
        hospitalManageContainerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), "Manage Hospital Organisation"));
        hospitalManageContainerPanel.setForeground(new java.awt.Color(255, 255, 255));
        hospitalManageContainerPanel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        hospitalManageContainerPanel.setOpaque(false);

        manageOrganizationJButton.setBackground(new java.awt.Color(0, 51, 51));
        manageOrganizationJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Add New Organization");
        manageOrganizationJButton.setBorder(null);
        manageOrganizationJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        userJButton.setBackground(new java.awt.Color(0, 153, 51));
        userJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("User Directory");
        userJButton.setBorder(null);
        userJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });

        manageEmployeeJButton.setBackground(new java.awt.Color(0, 102, 51));
        manageEmployeeJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Employee Directory");
        manageEmployeeJButton.setBorder(null);
        manageEmployeeJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hospitalManageContainerPanelLayout = new javax.swing.GroupLayout(hospitalManageContainerPanel);
        hospitalManageContainerPanel.setLayout(hospitalManageContainerPanelLayout);
        hospitalManageContainerPanelLayout.setHorizontalGroup(
            hospitalManageContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalManageContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(userJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        hospitalManageContainerPanelLayout.setVerticalGroup(
            hospitalManageContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalManageContainerPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(hospitalManageContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        add(hospitalManageContainerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 780, 1030, 180));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), "Work Request"));
        jPanel1.setOpaque(false);

        hospitalWorkRequestTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        hospitalWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Work Request Object", "Medical Travel Agency", "Medical Attention Required", "Status", "Doctor Assigned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        hospitalWorkRequestTable.setRowHeight(25);
        jScrollPane1.setViewportView(hospitalWorkRequestTable);
        if (hospitalWorkRequestTable.getColumnModel().getColumnCount() > 0) {
            hospitalWorkRequestTable.getColumnModel().getColumn(0).setResizable(false);
            hospitalWorkRequestTable.getColumnModel().getColumn(1).setResizable(false);
            hospitalWorkRequestTable.getColumnModel().getColumn(2).setResizable(false);
            hospitalWorkRequestTable.getColumnModel().getColumn(3).setResizable(false);
            hospitalWorkRequestTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 1230, 230));

        ambWorkReqProcessjButton.setBackground(new java.awt.Color(204, 51, 0));
        ambWorkReqProcessjButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        ambWorkReqProcessjButton.setForeground(new java.awt.Color(255, 255, 255));
        ambWorkReqProcessjButton.setText("Process Request");
        ambWorkReqProcessjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ambWorkReqProcessjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambWorkReqProcessjButtonActionPerformed(evt);
            }
        });
        add(ambWorkReqProcessjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 440, 250, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/hospital-admin.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        logger.debug("Hospital Admin Work Panel: User Directory");
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        logger.debug("Hospital Admin Work Panel: Employee Directory");
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)) {
            //Hospital Org
            ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
            userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        }
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        logger.debug("Hospital Admin Work Panel: Add New Organization");
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise.getEnterpriseType());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void ambWorkReqProcessjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambWorkReqProcessjButtonActionPerformed

       
        int selectedRow = hospitalWorkRequestTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request to process !","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        HospitalWorkRequest request = (HospitalWorkRequest) hospitalWorkRequestTable.getModel().getValueAt(selectedRow, 0);
        
        boolean doctorFound = false;
        ArrayList<Doctor> doctorsAssigned = new ArrayList<Doctor>();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            
            if (org instanceof DoctorOrganization) {
                for (Employee employee : org.getEmployeeDirectory().getEmployeeList()) {
                    Doctor d = (Doctor) employee;
                    if (d.getSpec().equals(request.getMedicalCondition())) {
                        doctorFound = true;
                        doctorsAssigned.add(d);
                        
                    }
                }
                
            }
            
        }

        if (!doctorFound) {
            for (Enterprise enterpriseinj : enterpriseList) {
                if (enterpriseinj instanceof MedicalCouncilEnterprise) {
                    MedicalCouncilEnterprise med = (MedicalCouncilEnterprise) enterpriseinj;
                    for (Employee employee : med.getOrganizationDirectory().getOrganizationList().get(0).
                            getEmployeeDirectory().getEmployeeList()) {
                        Doctor d = (Doctor) employee;
                        if (d.getSpec().equals(request.getMedicalCondition())) {
                            doctorFound = true;
                            doctorsAssigned.add(d);
                            
                        }
                    }
                }
            }
            
        }

        if (!doctorFound) {
            logger.info("Doctor not found for this operation");
            JOptionPane.showMessageDialog(this, "Sorry no Specialist Doctor found.",
                    "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
            request.setHospitalStatus("Rejected");
            request.setStatus("Rejected");
        } else {
            logger.info("Request placed in a queue and awaiting for doctor to accept it.");
            request.setHospitalStatus("Doctor in line");
            request.setDoctorStatus("Pending");

            for (Enterprise enterpriseInj : enterpriseList) {
                    for (Organization org : enterpriseInj.getOrganizationDirectory().getOrganizationList()) {
                    //for (Employee employee: org.getEmployeeDirectory().getEmployeeList()){
                        for (UserAccount userAcc : org.getUserAccountDirectory().getUserAccountList()) {
                            if (userAcc.getEmployee() instanceof Doctor) {
                                for(Doctor  doctor: doctorsAssigned){

                                    if (((Doctor) userAcc.getEmployee()).getName().equals(doctor.getName())
                                            && ((Doctor) userAcc.getEmployee()).getSpec().equals(doctor.getSpec())) {

                                        ((Doctor) userAcc.getEmployee()).getWorkQueue().getWorkRequestList().add(request);
                                         
                                    }
                              }
                                
                            }
                        }
                }
            }
           JOptionPane.showMessageDialog(this, "Request sent to doctor successfully.",
                                            "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);

        }

        populateTable();

    }//GEN-LAST:event_ambWorkReqProcessjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambWorkReqProcessjButton;
    private javax.swing.JPanel hospitalManageContainerPanel;
    private javax.swing.JTable hospitalWorkRequestTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
