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
public class OrderDirectory {
    private ArrayList<Order> orderlist;
    
    public OrderDirectory(){
        this.orderlist=new ArrayList<>();
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }
    
    public Order createOrder(Session session,SeatCatalog seatlist){
        Order order=new Order();
        order.setSession(session);
        order.setSeatlist(seatlist);
        orderlist.add(order);
        return order;
    }
    
    public void deleteOrder(Order order){
        orderlist.remove(order);
    }
    
    
}
