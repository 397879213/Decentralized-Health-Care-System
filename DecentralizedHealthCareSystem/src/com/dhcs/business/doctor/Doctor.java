/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.doctor;

import com.dhcs.business.employee.Employee;
import com.dhcs.business.enterprise.HospitalEnterprise;
import com.dhcs.business.workqueue.WorkQueue;

/**
 *
 * @author shive
 */
public class Doctor extends Employee {
    
    
    private HospitalEnterprise hospitalEnterprise;
    private Speciality speciality;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
     public enum Speciality{
         
        Physician("Physician"),
        Dentist("Dentist"),
        Anesthesiologists("Anesthesiologists "),
        Cardiologists ("Cardiologists"),
        Dermatologists("Dermatologists"),
        Nephrologists ("Nephrologists"),
        Neurologists ("Neurologists"),
        Physiatrists ("Psychiatrists"),
        GeneralSurgeons ("General Surgeons"),
        Orthopedics("Orthopedics");
        
        private String value;
        private Speciality(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

      public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    public Speciality getSpec() {
        return speciality;
    }

    public void setSpec(Speciality spec) {
        this.speciality = spec;
    }
    
    
    
    
    
}
