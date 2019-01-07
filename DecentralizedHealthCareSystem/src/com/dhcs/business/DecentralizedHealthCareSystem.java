/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhcs.business;

import com.dhcs.business.network.Network;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.role.Role;
import com.dhcs.business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class DecentralizedHealthCareSystem extends Organization{
    
    private static DecentralizedHealthCareSystem business;
    private ArrayList<Network> networkList;
    public static DecentralizedHealthCareSystem getInstance(){
        if(business==null){
            business=new DecentralizedHealthCareSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private DecentralizedHealthCareSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfNetworkIsUnique(String username){
        for (Network network : networkList){
            if (network.getName().trim().equalsIgnoreCase(username.trim()))
                return false;
        }
        return true;
    }
}
