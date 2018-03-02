/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Movie;
import ReadCSV.ReadSeat;

/**
 *
 * @author andyg
 */
public class Session {
    private Movie movie;
    private String Date;
    private String time;
    private double price;
    private SeatCatalog seatlist;
    
    public Session(){
        this.seatlist=new SeatCatalog();
        ReadSeat readSeat=new ReadSeat();
      String myArray[][]=readSeat.setUpMyCsvArray();
      for(int i=0;i<60;i++){
            Seat seat=seatlist.addSeat();
            seat.setSeatNum(myArray[i][0]);
            seat.setStatus(myArray[i][1]);
      }
    }

    public SeatCatalog getSeatlist() {
        return seatlist;
    }

    
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString(){
        return this.movie.getName();
    }
    
    
    
}
