/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RatingAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class RatingAdminOrganization extends Organization{
    public RatingAdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RatingAdminRole());
        return roles;
    }
}
