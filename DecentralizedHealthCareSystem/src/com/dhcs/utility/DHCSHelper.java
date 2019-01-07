package com.dhcs.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author shivesh
 */
public class DHCSHelper {
    
    public static final String emailRegEx = "^(?!_)[A-za-z0-9]+\\w*@((?!_)[A-za-z0-9]){1,15}(([.]{1}[A-Za-z0-9]{2,15}){1,2})$";       
    public static final String pwdRegEx = "([\\w$+]+){5,15}";
    
    public boolean validInput(String regEx, String matchString){
        
        boolean flag;
        Pattern p = Pattern.compile(regEx); 
        Matcher m = p.matcher(matchString);  
        flag = m.matches(); 
//        if(!flag){
//           JOptionPane.showMessageDialog(null, "Please enter a valid Email Id"); 
//        }
        return flag;
        
    }
     public boolean pwdFieldValidator(boolean flag, JTextField txtFld, JTextField txtFldToEnabled) {
        while(flag == false){
            
            flag = validInput("([\\w$+]+){6,15}", txtFld.getText());
            
            if(flag){
                txtFldToEnabled.setEditable(flag);
                
            }else{
                JOptionPane.showMessageDialog(null, "Please enter a valid Input !");
                txtFld.setText("");
                txtFld.requestFocus();                
            }
            break;
        }
        return flag;
    }
     
   
}
