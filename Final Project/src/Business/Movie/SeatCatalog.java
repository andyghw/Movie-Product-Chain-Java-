/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Movie;

import java.util.ArrayList;

/**
 *
 * @author andyg
 */
public class SeatCatalog {
    private ArrayList<Seat> seatlist;
    
    public SeatCatalog(){
        this.seatlist=new ArrayList<>();
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }
    
    public Seat addSeat(){
        Seat seat=new Seat();
        seatlist.add(seat);
        return seat;
    }
    
    public Seat createSeat(String seatNum){
        Seat seat=new Seat();
        seat.setSeatNum(seatNum);
        seatlist.add(seat);
        return seat;
    }
    
}
