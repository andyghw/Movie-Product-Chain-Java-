/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Costume.Costume;
import Business.Costume.CostumeDirectory;

/**
 *
 * @author dell
 */
public class RequestForCostume extends WorkRequest{
    private Costume costume; 
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    

    public Costume getCostume() {
        return costume;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }


    
    
}
