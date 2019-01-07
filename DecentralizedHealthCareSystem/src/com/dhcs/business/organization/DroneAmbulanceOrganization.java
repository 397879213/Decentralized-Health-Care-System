package com.dhcs.business.organization;

import com.dhcs.business.role.DroneAmbulanceRole;
import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shive
 */
public class DroneAmbulanceOrganization extends Organization{
    
    public DroneAmbulanceOrganization(){
        super(Organization.Type.DroneAmbulance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DroneAmbulanceRole());
        return roles;
    }
    
}
