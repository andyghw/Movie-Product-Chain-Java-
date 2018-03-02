/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Movie.Movie;

/**
 *
 * @author andyg
 */
public class RequestForCopyRight extends WorkRequest{
    private Movie movie;
    private double investment;

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    public String toString(){
        return this.getMovie().getName();
    }
    
    
}
