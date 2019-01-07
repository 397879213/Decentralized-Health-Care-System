package com.dhcs.business.role;

import com.dhcs.business.DecentralizedHealthCareSystem;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import com.dhcs.userinterface.role.administrative.AdminWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author shivesh
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, DecentralizedHealthCareSystem business,  ArrayList<Enterprise> enterpriseList) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, enterpriseList);
    }

    
    
}
