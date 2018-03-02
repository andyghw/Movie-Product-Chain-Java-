/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.SponsorManager.getValue())){
            organization = new SponsorManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Financial.getValue())){
            organization = new FinancialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lighting.getValue())){
            organization = new LightingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Director.getValue())){
            organization = new DirectorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Actor.getValue())){
            organization = new ActorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Camera.getValue())){
            organization = new CameraOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Costume.getValue())){
            organization = new CostumeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MovieRating.getValue())){
            organization = new MovieRatingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TheaterManager.getValue())){
            organization = new TheaterManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RatingManager.getValue())){
            organization = new RatingManagerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Admin.getValue())){
            organization=new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SupplierManager.getValue())){
            organization = new SupplierManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Editor.getValue())){
            organization = new EditorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RatingDirector.getValue())){
            organization = new RatingDirectorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.RatingActor.getValue())){
            organization = new RatingActorOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.RatingStaff.getValue())){
            organization = new RatingStaffOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Organization o){
        organizationList.remove(o);
    }
}