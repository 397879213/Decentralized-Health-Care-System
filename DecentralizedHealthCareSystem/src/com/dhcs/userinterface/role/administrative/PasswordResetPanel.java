package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.email.SendMailUsingAuthentication;
import java.awt.CardLayout;
import java.awt.Font;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import org.apache.log4j.Logger;

/**
 *
 * @author shivesh
 */
public class PasswordResetPanel extends javax.swing.JPanel {

   private Organization organization;
   private JPanel container;
   
   //Mail Variables
   private static String emailMsgTxt = "";
   private static String emailSubjectTxt = "";
   private static String emailFromAddress = "";
   private static final Logger logger = Logger.getLogger(PasswordResetPanel.class);

   public PasswordResetPanel(JPanel containerInj,Organization organizationInj) {
        initComponents();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));  
        this.organization =  organizationInj;
        this.container =  containerInj;
        resetUserPwdJButton.setEnabled(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordJTextField = new javax.swing.JPasswordField();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resetUserPwdJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 289, 55));

        nameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        nameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJTextFieldFocusLost(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 289, 55));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 210, -1));

        resetUserPwdJButton.setBackground(new java.awt.Color(255, 102, 102));
        resetUserPwdJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        resetUserPwdJButton.setText("Reset Password");
        resetUserPwdJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        resetUserPwdJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetUserPwdJButtonActionPerformed(evt);
            }
        });
        add(resetUserPwdJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 300, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Id");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 190, 40));

        emailJTextField.setEditable(false);
        emailJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 474, 55));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password Reset Panel");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 680, 80));

        backjButton1.setBackground(new java.awt.Color(0, 102, 102));
        backjButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backjButton1.setText("Back");
        backjButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, 300, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/password_reset.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void resetUserPwdJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetUserPwdJButtonActionPerformed

        //Reseting Password
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        
        if(!userName.trim().isEmpty() && !password.trim().isEmpty()){
            UserAccount acc = organization.getUserAccountDirectory().checkIfUsernameExists(userName);
            if(acc != null) {

                if(acc.getEmail() != null){
                    emailJTextField.setText(acc.getEmail());
                }else{
                    JOptionPane.showMessageDialog(this, "Email id is not configured!",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                String emailReceipeint = emailJTextField.getText();
                acc.setPassword(password);
                
                //Sending Mail Functionality
                emailMsgTxt = "Hi,"+" "+acc.getUsername() + "\nYour Password has been Reset. \nYour New Password is: " 
                        + password+"\nNOTE: Don't share your password." +"\n\nThanks,"+"\nDecentralized Healthcare Systems";
                emailSubjectTxt = "Password Reset Request";
                emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;  

                SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
                    try {
                        smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
                        nameJTextField.setText("");
                        emailJTextField.setText("");
                        passwordJTextField.setText("");
                        resetUserPwdJButton.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "User's password has been changed and  mail sent successfully.");
                        
                        
                    }catch (MessagingException ex) {
                        logger.error("exception occured during sendin mail : ", ex);
                        JOptionPane.showMessageDialog(this, "Request cannot be processed now, Please try after sometime",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                    }
            }else {
                JOptionPane.showMessageDialog(this, "User does not exists",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(this, "User credentials required!",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_resetUserPwdJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
       
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void nameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJTextFieldFocusLost
        
        UserAccount acc = null;
        String userName = nameJTextField.getText();
        if(!userName.trim().isEmpty()){
            acc = organization.getUserAccountDirectory().checkIfUsernameExists(userName);
        }else{
            JOptionPane.showMessageDialog(this, "Please enter a valid User name",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(acc != null) {

                if(acc.getEmail() != null){
                    emailJTextField.setText(acc.getEmail());
                    resetUserPwdJButton.setEnabled(true);
                    nameJTextField.setEditable(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Email Id not Configured!",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                }
         }else{
            JOptionPane.showMessageDialog(this, "User not found! Please re-enter registered user",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
            nameJTextField.setText("");
        }
    }//GEN-LAST:event_nameJTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JButton resetUserPwdJButton;
    // End of variables declaration//GEN-END:variables
}
