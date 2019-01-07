/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.enterprise;

import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivesh
 */
public class MedicalCouncilEnterprise  extends Enterprise {
    public MedicalCouncilEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MedicalCouncil);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
