/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Costume.CostumeDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Movie.MovieCatalog;
import Business.Movie.SeatCatalog;

/**
 *
 * @author andyg
 */
public class Network {
    private String name;
    private MovieCatalog movielist;
    private EnterpriseDirectory enterpriseDirectory;
    private CostumeDirectory costumeDirectory;
    
    public Network(){
        this.enterpriseDirectory=new EnterpriseDirectory();
        this.movielist=new MovieCatalog();
        this.costumeDirectory=new CostumeDirectory();
    }
    
    

    public MovieCatalog getMovielist() {
        return movielist;
    }

    public CostumeDirectory getCostumeDirectory() {
        return costumeDirectory;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public String toString(){
        return name;
    }


    
    
    
    
}
