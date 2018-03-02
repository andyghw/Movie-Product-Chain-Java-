/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Movie.Movie;

/**
 *
 * @author andyg
 */
public class RequestForSponsorship extends WorkRequest{
    private Enterprise Enterprise;
    private Movie movie;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    

    public Enterprise getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(Enterprise Enterprise) {
        this.Enterprise = Enterprise;
    }
    
    public String toString(){
        return this.movie.getName();
    }
    
}
