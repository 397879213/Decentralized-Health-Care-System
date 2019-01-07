package com.dhcs.business.organization;

import com.dhcs.business.role.DoctorRole;
import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivesh
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
}