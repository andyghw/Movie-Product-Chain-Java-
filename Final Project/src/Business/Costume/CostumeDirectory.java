/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Costume;

import java.util.ArrayList;

/**
 *
 * @author andyg
 */
public class CostumeDirectory {
    private ArrayList<Costume> costumelist;
    
    public CostumeDirectory(){
        this.costumelist=new ArrayList<>();
    }

    public ArrayList<Costume> getCostumelist() {
        return costumelist;
    }
    
    public Costume addCostume(String name,double price,int number){
        Costume costume=new Costume();
        costume.setName(name);
        costume.setPrice(price);
        costume.setNumber(number);
        costumelist.add(costume);
        return costume;
    }
    
    public void deleteCostume(Costume c){
        costumelist.remove(c);
    }
    
    
}
