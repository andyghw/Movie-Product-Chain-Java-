/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Movie;

import Business.Employee.EmployeeDirectory;

/**
 *
 * @author HH
 */
public class Movie {
    private String name;
    private String director;
    private double rating;
    private double budget;
    private EmployeeDirectory employeelist;
    private int count=-1; 
    private String description;
    private String comment;
    
    
    public Movie(){
        this.employeelist=new EmployeeDirectory();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public int getCount() {
        return count;
    }

    public  void setCount(int count) {
        this.count = count;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    
    public EmployeeDirectory getEmployeelist() {
        return employeelist;
    }
    

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        count++;
        this.rating = rating; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
}
