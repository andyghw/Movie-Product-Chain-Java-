/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Movie.Seat;
import Business.Movie.SeatCatalog;
import java.util.ArrayList;

/**
 *
 * @author andyg
 */
public class TheaterEnterprise extends Enterprise{
    
    public TheaterEnterprise(String name){
        super(name,EnterpriseType.Theater);
        
        
    }

    
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
