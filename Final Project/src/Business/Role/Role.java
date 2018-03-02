/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Actor("Actor"),
        Director("Director"),
        Lighting("Lighting"),
        MovieRating("MovieRating"),
        SponsorAdmin("SponsorAdmin"),
        SponsorManager("SponsorManager"),
        Financial("Financial"),
        FilmAdmin("FilmAdmin"),
        Camera("Camera"),
        CostumeManager("CostumeManager"),
        Customer("Customer"),
        RatingAdmin("RatingAdmin"),
        RatingManager("RatingManager"),
        RatingDirector("RatingDirector"), 
        RatingStaff("RatingStaff"),
        RatingActor("RatingActor"),
        TheaterAdmin("TheaterAdmin"),
        TheaterManager("TheaterManager"),
        SupplierManager("SupplierManager"),
        Editor("Editor");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}