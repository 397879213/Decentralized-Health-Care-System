/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business.role;

import com.dhcs.business.DecentralizedHealthCareSystem;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.organization.AmbulanceOrganization;
import com.dhcs.business.organization.DroneAmbulanceOrganization;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.userinterface.role.ambulancestaff.AmbulanceStaffWorkAreaJPanel;
import com.dhcs.userinterface.role.droneambulancestaff.DroneAmbulanceStaffWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author shive
 */
public class DroneAmbulanceRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DecentralizedHealthCareSystem business, ArrayList<Enterprise> enterpriseList) {
        return new DroneAmbulanceStaffWorkAreaJPanel(userProcessContainer, account, (DroneAmbulanceOrganization)organization, enterprise,enterpriseList);
    }
    
}
