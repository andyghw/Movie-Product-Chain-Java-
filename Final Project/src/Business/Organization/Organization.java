/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=1;
    
    public enum Type{
        Admin("Admin Organization"),SponsorManager("Sponsor Manager Organization"),Financial("Financial Organization"),
        Director("Director Organization"),Actor("Actor Organzation"),Lighting("Lighting Organization"),Camera("Camera Organization"),Costume("Costume Organization"),Editor("Editor Organization"),
        RatingManager("Rating Manager Organization"),MovieRating("Movie Rating Organization"),RatingDirector("Rating Director Organization"),RatingActor("Rating Actor Organization"),RatingStaff("Rating Staff Organization"),
        TheaterManager("Theater Manager Organization"),Customer("Customer Organization"),
        SupplierManager("Supplier Manager Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        public String toString(){
            return this.value;
        }

    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    


    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return name;
    }
    
    
}
