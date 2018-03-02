/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author andyg
 */
public abstract class Enterprise extends Organization{
    private String name;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType type;
   
   

    
    public enum EnterpriseType{
        Twitter("Twitter"),
        MovieManufacture("Movie Manufacture"),
        Theater("Theater"),
        Sponsor("Sponsor"),
        Supplier("Supplier");
        private final String value;
        private EnterpriseType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        public String toString(){
            return this.value;
        }
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.type=type;
        this.organizationDirectory=new OrganizationDirectory();
    }

    public EnterpriseType getType() {
        return type;
    }
    
    
   

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    
    public String toString(){
        return this.getName();
    }
    
    
}
