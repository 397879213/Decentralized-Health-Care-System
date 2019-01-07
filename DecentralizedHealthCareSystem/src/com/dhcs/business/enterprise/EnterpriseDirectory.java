/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.enterprise;

import com.dhcs.business.organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public boolean createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
            return true;
        }
        if(type==Enterprise.EnterpriseType.MedicalTravelAgency){
             
           for(Enterprise  e: enterpriseList){
                if(e.getEnterpriseType().equals(type)){
                    return false;
                }
            }
            enterprise = new MedicalTravelAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.MedicalCouncil){
            
            for(Enterprise  e: enterpriseList){
                if(e.getEnterpriseType().equals(type)){
                    return false;
                }
            }
            enterprise = new MedicalCouncilEnterprise(name);
            enterpriseList.add(enterprise);
            
           
        }
         return true;
    }
    
    public boolean checkIfEnterpriseNameIsUnique(String username){
        for (Enterprise enterprise : enterpriseList){
            if (enterprise.getName().trim().equalsIgnoreCase(username))
                return false;
        }
        return true;
    }
}