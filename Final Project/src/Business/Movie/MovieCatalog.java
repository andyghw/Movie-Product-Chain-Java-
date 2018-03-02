/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Movie;

import Business.Employee.Employee;
import java.util.ArrayList;
/**
 *
 * @author HH
 */
public class MovieCatalog {
    
     private ArrayList<Movie> movieList;
     
     public MovieCatalog(){
         movieList = new ArrayList<>();
     }
     
      public ArrayList<Movie> getMovieList() {
        return movieList;
    }

   public Movie createMovie(String name,Employee employee,String director,double rate){
       Movie movie = new Movie();
        movie.setName(name);
        movie.getEmployeelist().getEmployeeList().add(employee);
        movie.setDirector(director);
        movie.setRating(rate);
        movieList.add(movie);
        return movie;
   }
    public Movie testMovie(String name,String director,double rate){
       Movie movie = new Movie();
        movie.setName(name);
        movie.setDirector(director);
        movie.setRating(rate);
        movieList.add(movie);
        return movie;
   }
    public Movie ratingMovie(Movie movie,String name,Employee employee,String director,double rate,String comment){
        movie.setName(name);
        movie.getEmployeelist().getEmployeeList().add(employee);
        movie.setDirector(director);
        movie.setRating(rate);
        movie.setComment(comment);
        movieList.add(movie);
        return movie;
   }
}
