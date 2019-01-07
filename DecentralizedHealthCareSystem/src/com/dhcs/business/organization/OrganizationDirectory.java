package com.dhcs.business.organization;

import com.dhcs.business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Shivesh
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DroneAmbulance.getValue())){
            organization = new DroneAmbulanceOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Organization o : organizationList){
            if (o.getName().trim().equalsIgnoreCase(username))
                return false;
        }
        return true;
    }
}