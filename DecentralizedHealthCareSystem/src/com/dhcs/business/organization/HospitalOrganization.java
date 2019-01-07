package com.dhcs.business.organization;

import com.dhcs.business.role.HospitalRole;
import com.dhcs.business.role.LabAssistantRole;
import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivesh
 */
public class HospitalOrganization extends Organization{

    public HospitalOrganization(){
        
        super(Organization.Type.HospitalOrganisation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalRole());
        return roles;
    }
    
}
