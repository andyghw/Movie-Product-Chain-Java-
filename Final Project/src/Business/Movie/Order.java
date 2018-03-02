/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Movie;

/**
 *
 * @author andyg
 */
public class Order {
    private Session session;
    private SeatCatalog seatlist;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public SeatCatalog getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(SeatCatalog seatlist) {
        this.seatlist = seatlist;
    }
    
    public String toString(){
        return this.session.getMovie().getName();
    }
    
}
