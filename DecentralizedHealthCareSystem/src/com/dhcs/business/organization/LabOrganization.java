
package com.dhcs.business.organization;

import com.dhcs.business.role.LabAssistantRole;
import com.dhcs.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivesh
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
