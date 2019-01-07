package com.dhcs.userinterface.role.ambulancestaff;

import com.dhcs.business.DecentralizedHealthCareSystem;
import com.dhcs.business.doctor.Doctor;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.network.Network;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.business.workqueue.HospitalWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import org.apache.log4j.Logger;


/**
 *
 * @author Shivesh
 */
public class RequestHospitalJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ArrayList<Enterprise> enterpriseList;
    private static final Logger logger = Logger.getLogger(RequestHospitalJPanel.class);
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestHospitalJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,
            ArrayList<Enterprise> enterpriseListInj ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.enterpriseList = enterpriseListInj;
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));  
        populateMedicalCategoryJcomboBox();
        populateHospitalNamejComboBox(enterpriseListInj);
    }

        private void populateMedicalCategoryJcomboBox(){
            for(Doctor.Speciality spec: Doctor.Speciality.values()){
                medicalCategoryJcomboBox.addItem(spec);
            }

        }
        
        private void populateHospitalNamejComboBox(ArrayList<Enterprise> enterpriseList){
       
//            for(Network network : careSystem.getNetworkList()){          
//                for(Enterprise enterp: network.getEnterpriseDirectory().getEnterpriseList()) {
//                    
//                    if(enterp.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)) {
//                        hospitalNamejComboBox.addItem(enterp);
//                    }
//                }
//            }
            for(Enterprise enterp: enterpriseList) {
                if(enterp.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)) {
                    hospitalNamejComboBox.addItem(enterp);
                }
            }
        }
        
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        medicalCategoryJcomboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        hospitalNamejComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(204, 0, 0));
        requestTestJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        requestTestJButton.setText("Request Hospital");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, 300, 60));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 300, 60));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" Medical Category");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 440, 60));

        medicalCategoryJcomboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(medicalCategoryJcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 360, 60));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(" Hospital Name");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 440, 60));

        hospitalNamejComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(hospitalNamejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 360, 60));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 45)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Request To Hospital ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 3));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 660, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/request_hospital.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        Doctor.Speciality speciality = (Doctor.Speciality) medicalCategoryJcomboBox.getSelectedItem();
        Enterprise enterpriseHospital = (Enterprise) hospitalNamejComboBox.getSelectedItem();
        if(speciality != null && enterpriseHospital != null){
            logger.info("Speaciality of Doctor selected:"+speciality);
            HospitalWorkRequest request = new HospitalWorkRequest();
            request.setHospitalName(enterpriseHospital);
            request.setMedicalCondition(speciality);
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setHospitalStatus("Pending");       
            enterpriseHospital.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(this, "Request sent to "+enterpriseHospital +" hospital successfully",
                    "Decentralised Health Care System",JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this, "All fields are mandatory",
                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
        }
       
        
       
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AmbulanceStaffWorkAreaJPanel ambulanceStaffWorkAreaJPanel = (AmbulanceStaffWorkAreaJPanel) component;
        ambulanceStaffWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox hospitalNamejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox medicalCategoryJcomboBox;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
