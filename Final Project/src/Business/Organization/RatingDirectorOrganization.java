/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RatingDirectorRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author HH
 */
public class RatingDirectorOrganization extends Organization{
    public RatingDirectorOrganization() {
        super(Type.RatingDirector.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RatingDirectorRole());
        return roles;
    }
}
