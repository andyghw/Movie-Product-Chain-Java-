/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author andyg
 */
public class TwitterEnterprise extends Enterprise{
    private String name;
    public TwitterEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Twitter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
