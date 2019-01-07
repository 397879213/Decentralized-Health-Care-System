package com.dhcs.business.role;

import com.dhcs.business.DecentralizedHealthCareSystem;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.useraccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Shivesh 
 */
public abstract class Role {
    
    /**
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param business
     * @param enterpriseList
     * @return
     */
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            DecentralizedHealthCareSystem business,  ArrayList<Enterprise> enterpriseList);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}