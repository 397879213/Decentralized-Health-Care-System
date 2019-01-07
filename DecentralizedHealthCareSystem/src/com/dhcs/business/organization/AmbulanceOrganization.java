package com.dhcs.business.organization;

import com.dhcs.business.role.AmbulanceRole;
import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivesh
 */
public class AmbulanceOrganization extends Organization {
    
    public AmbulanceOrganization(){  
        super(Organization.Type.Ambulance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AmbulanceRole());
        return roles;
    }
    
}
