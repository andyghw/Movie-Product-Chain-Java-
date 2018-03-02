/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ActorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class ActorOrganization extends Organization{
    public ActorOrganization() {
        super(Type.Actor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ActorRole());
        return roles;
    }
}
