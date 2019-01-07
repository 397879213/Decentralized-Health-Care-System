/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.employee;

import com.dhcs.business.doctor.Doctor;
import com.dhcs.business.enterprise.HospitalEnterprise;
import com.dhcs.business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shivesh
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    public Employee createEmployee(String name, Doctor.Speciality speciality, HospitalEnterprise hospitalEnterprise){
        Doctor doc = new Doctor();
        doc.setName(name);
        doc.setSpec(speciality);
        doc.setHospitalEnterprise(hospitalEnterprise);
        doc.setWorkQueue(new WorkQueue());
        
        employeeList.add(doc);
        return doc;
    }
    public Employee createEmployee(String name, Doctor.Speciality speciality){
        Doctor doc = new Doctor();
        doc.setName(name);
        doc.setSpec(speciality);
        employeeList.add(doc);
        return doc;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (Employee e : employeeList){
            if (e.getName().trim().equalsIgnoreCase(username))
                return false;
        }
        return true;
    }
}