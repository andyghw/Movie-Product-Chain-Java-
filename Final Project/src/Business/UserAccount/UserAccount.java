/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Costume.CostumeDirectory;
import Business.Employee.Employee;
import Business.Movie.MovieCatalog;
import Business.Movie.OrderDirectory;
import Business.Movie.SessionDirectory;
import Business.Role.Role;
import Business.Movie.SeatCatalog;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private MovieCatalog movielist;
    private SessionDirectory sessionlist;
    private OrderDirectory orderlist;
    private CostumeDirectory costumeDirectory;

    public UserAccount() {
        this.workQueue = new WorkQueue();
        this.movielist=new MovieCatalog();
        this.orderlist=new OrderDirectory();
        this.sessionlist=new SessionDirectory();
        this.costumeDirectory=new CostumeDirectory();
    }

    public SessionDirectory getSessionlist() {
        return sessionlist;
    }

    public OrderDirectory getOrderlist() {
        return orderlist;
    }

    public CostumeDirectory getCostumeDirectory() {
        return costumeDirectory;
    }
    
    

    
    

    public MovieCatalog getMovielist() {
        return movielist;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }


    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}