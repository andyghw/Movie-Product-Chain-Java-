/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Costume.CostumeDirectory;
import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author andyg
 */
public class EnterpriseDirectory {
    ArrayList<Enterprise> enterpriseslist;
    
    
    public EnterpriseDirectory(){
        this.enterpriseslist=new ArrayList<>();
       
    }

     
    public ArrayList<Enterprise> getEnterpriseslist() {
        return enterpriseslist;
    }
    
    
    public void deleteEnterprise(Enterprise e){
        enterpriseslist.remove(e);
    }
    
    public Enterprise createEnterprise(EnterpriseType type,String name){
        Enterprise e=null;
        if(type==Enterprise.EnterpriseType.MovieManufacture){
            e=new MovieManufactureEnterprise(name);
            enterpriseslist.add(e);
        }
        if(type==Enterprise.EnterpriseType.Sponsor){
            e=new SponsorEnterprise(name);
            enterpriseslist.add(e);
        }
        if(type==Enterprise.EnterpriseType.Theater){
            e=new TheaterEnterprise(name);
            enterpriseslist.add(e);
        }
        if(type==Enterprise.EnterpriseType.Twitter){
            e=new TwitterEnterprise(name);
            enterpriseslist.add(e);
        }
        if(type==Enterprise.EnterpriseType.Supplier){
            e=new SupplierEnterprise(name);
            enterpriseslist.add(e);
        }
        return e;
        
    }
    
    
}
