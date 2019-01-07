/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.useraccount;

import com.dhcs.business.employee.Employee;
import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shivesh
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String email, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmail(email);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.getEmployeesCreated().add(employee);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public boolean isEmployeeExist(Employee employee){
        
        for(UserAccount ua : userAccountList){
            if (ua.getEmployee().equals(employee))
                return true;
        }
        
        return false;
    }
    
    /**
     *
     * @param email
     * @return
     */
    public boolean checkIfEmailIdIsUnique(String email){
        for (UserAccount ua : userAccountList){
            if (ua.getEmail().equals(email))
                return false;
        }
        return true;
    }
    
    public UserAccount checkIfUsernameExists(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().trim().equalsIgnoreCase(username))
                return ua;
        }
        return null;
    }
}
