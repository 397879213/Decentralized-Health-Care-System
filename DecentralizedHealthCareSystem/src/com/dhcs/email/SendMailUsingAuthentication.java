package com.dhcs.email;

import javax.mail.*;                                                                                                                
import javax.mail.internet.*;                                                                                                    
import java.util.*;                                                                                                                    
                                                                                                                                                            
/**
 *
 * @author shivesh
 */
public class SendMailUsingAuthentication                                                                               
{                                                                                                                                            
  public static final String SMTP_HOST_NAME = "smtp.gmail.com";  // for google                
  public static final String SMTP_AUTH_USER = "decentralizedhealthcaresystem@gmail.com"; // Username                        
  public static final String SMTP_AUTH_PWD  = "BHAGAT007";  // Password                     
                                                                                                                                             

  // Add  Email address to whom email needs to be sent                                                
  public void postMail( String recipients, String subject,                                                       
                            String message , String from) throws MessagingException                          
  {                                                                                                                                         
    boolean debug = false;                                                                                                       
     //Set the host smtp address                                                                                               
     Properties props = new Properties();                                                                                
     props.put("mail.smtp.starttls.enable","true");                                                                     
     props.put("mail.smtp.host", SMTP_HOST_NAME);                                                        
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.port", "587");

    Authenticator auth = new SMTPAuthenticator();                                                                
    Session session = Session.getDefaultInstance(props, auth);                                                 
    System.out.println("created session");
    session.setDebug(debug);                                                                                                  

    // create a message                                                                                                            
    Message msg = new MimeMessage(session);   
      System.out.println("created Mime Message");

    // set the from and to address                                                                                            
    InternetAddress addressFrom = new InternetAddress(from);                                             
    msg.setFrom(addressFrom);                                                                                             

    InternetAddress[] addressTo = new InternetAddress[1];                             
    addressTo[0]=new InternetAddress(recipients);                                                                                                                                      
    msg.setRecipients(Message.RecipientType.TO, addressTo);                                             
    // Setting the Subject and Content Type                                                                            
    msg.setSubject(subject);                                                                                                  
    msg.setContent(message, "text/plain");     
    System.out.println("Sending email");
    Transport.send(msg);                                                                                                       
 }  
  
  private class SMTPAuthenticator extends javax.mail.Authenticator                                        
    {                                                                                                                                          

        @Override                                                                                                                   
        public PasswordAuthentication getPasswordAuthentication(){                                                                                                                                      
           
            String username = SMTP_AUTH_USER;                                                                    
            String password = SMTP_AUTH_PWD;                                                                     
            return new PasswordAuthentication(username, password);                                             
        }                                                                                                                                       
    } 
}