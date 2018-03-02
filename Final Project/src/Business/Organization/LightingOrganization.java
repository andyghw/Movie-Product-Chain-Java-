/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author andyg
 */
import Business.Role.CameraRole;
import Business.Role.LightingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class LightingOrganization extends Organization{
    public LightingOrganization() {
        super(Organization.Type.Lighting.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LightingRole());
        return roles;
    }
}
