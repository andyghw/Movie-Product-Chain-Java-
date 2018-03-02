/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CostumeManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class CostumeOrganization extends Organization{
    public CostumeOrganization() {
        super(Type.Costume.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CostumeManagerRole());
        return roles;
    }
}
