/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TheaterAdminRole;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class TheaterAdminOrganization extends Organization{
    public TheaterAdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TheaterAdminRole());
        return roles;
    }
}
