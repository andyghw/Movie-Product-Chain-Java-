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
public class SessionDirectory {
    private ArrayList<Session> sessionlist;
    
    public SessionDirectory(){
        this.sessionlist=new ArrayList<>();
    }

    public ArrayList<Session> getSessionlist() {
        return sessionlist;
    }
    
    public Session createSession(Movie movie,String date,String time,double price){
        Session session=new Session();
        session.setMovie(movie);
        session.setDate(date);
        session.setTime(time);
        session.setPrice(price);
        sessionlist.add(session);
        return session;
    }
    
    
}
