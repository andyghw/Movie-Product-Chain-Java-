/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Costume.Costume;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MovieManufactureEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;
import ReadCSV.ReadSeat;
import Business.Movie.Seat;
import Business.Movie.SeatCatalog;



/**
 *
 * @author andyg
 */
public class ConfigureABusiness {

    public static EcoSystem configure(){
        EcoSystem system=EcoSystem.getInstance();
        Employee employee=system.getEmployeeDirectory().createEmployee("SysAdmin");
        UserAccount userAccount=system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());

      Network network=system.createNetwork("Movie Manufacture Network");
      
  
      


      return system;
      
    }
}
