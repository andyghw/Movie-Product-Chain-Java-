/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author andyg
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkslist;
    
    private EcoSystem(){
        super(null);
        this.networkslist=new ArrayList<>();

    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public ArrayList<Network> getNetworkslist() {
        return networkslist;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new SysAdminRole());
        return roles;
    }


    
    
    
    public Network createNetwork(String name){
        Network network=new Network();
        network.setName(name);
        networkslist.add(network);
        return network;
    }
    


    
    
    
    
    
}
