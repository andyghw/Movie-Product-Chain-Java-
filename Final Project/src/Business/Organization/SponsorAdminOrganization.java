/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.SponsorAdminRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SponsorAdminOrganization extends Organization{

    public SponsorAdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SponsorAdminRole());
        return roles;
    }
     
}
