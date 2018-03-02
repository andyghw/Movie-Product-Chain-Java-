/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RatingActorRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author HH
 */
public class RatingActorOrganization extends Organization{
    public RatingActorOrganization() {
        super(Type.RatingActor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RatingActorRole());
        return roles;
    }
    
}
