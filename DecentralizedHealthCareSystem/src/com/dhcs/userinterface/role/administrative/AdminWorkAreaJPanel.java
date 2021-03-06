package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.enterprise.Enterprise;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author  shivesh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    ArrayList<Enterprise> enterpriseList;
    private static final Logger logger = Logger.getLogger(AdminWorkAreaJPanel.class);
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,  ArrayList<Enterprise> enterpriseListInj) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.enterpriseList = enterpriseListInj;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 650, 80));

        userJButton.setBackground(new java.awt.Color(0, 153, 51));
        userJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("Manage User");
        userJButton.setBorder(null);
        userJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 690, 740, 60));

        manageEmployeeJButton.setBackground(new java.awt.Color(0, 102, 51));
        manageEmployeeJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(null);
        manageEmployeeJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 740, 60));

        manageOrganizationJButton.setBackground(new java.awt.Color(0, 51, 51));
        manageOrganizationJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(null);
        manageOrganizationJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 740, 60));

        valueLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/admin-work-panel.jpg"))); // NOI18N
        jLabel2.setFocusTraversalPolicyProvider(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1700, 100));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.MedicalCouncil)) {
            //Doctor Org
            ManageDoctorJPanel manageDoctorJPanel = new ManageDoctorJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterpriseList);
            userProcessContainer.add("manageDoctorJPanel", manageDoctorJPanel);
        } else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
           //Hospital Org
            ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
            userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        }else{
            //Travel Agency
            ManageTravelAgencyJPanel manageTravelAgencyJPanel = new ManageTravelAgencyJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterpriseList);
            userProcessContainer.add("manageTravelAgencyJPanel", manageTravelAgencyJPanel);
        }
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise.getEnterpriseType());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
