package com.dhcs.business.useraccount;

import com.db4o.collections.ActivatableArrayList;
import com.dhcs.business.employee.Employee;
import com.dhcs.business.role.Role;
import com.dhcs.business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Shivesh
 */
public class UserAccount {
    
    private ArrayList<Employee> employeesCreated;
    
    private String username;
    private String password;
    private String email;
    private Employee employee;
    
    private Role role;
    private WorkQueue workQueue;

    public ArrayList<Employee> getEmployeesCreated() {
        return employeesCreated;
    }

    public void setEmployeesCreated(ArrayList<Employee> employeesCreated) {
        this.employeesCreated = employeesCreated;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
        employeesCreated = new ActivatableArrayList<Employee>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}