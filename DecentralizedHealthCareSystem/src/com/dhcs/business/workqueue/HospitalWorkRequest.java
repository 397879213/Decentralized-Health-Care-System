/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.workqueue;

import com.dhcs.business.doctor.Doctor;
import com.dhcs.business.enterprise.Enterprise;

/**
 *
 * @author shivesh
 */
public class HospitalWorkRequest extends WorkRequest {
    
    
    private Enterprise hospitalName;
    private Doctor.Speciality medicalCondition;
    private Doctor  doctor;
    private String hospitalStatus;
    private String doctorStatus;

    public String getHospitalStatus() {
        return hospitalStatus;
    }

    public void setHospitalStatus(String hospitalStatus) {
        this.hospitalStatus = hospitalStatus;
    }

    public String getDoctorStatus() {
        return doctorStatus;
    }

    public void setDoctorStatus(String doctorStatus) {
        this.doctorStatus = doctorStatus;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    public Enterprise getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(Enterprise hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Doctor.Speciality getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(Doctor.Speciality medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
    
    
}
