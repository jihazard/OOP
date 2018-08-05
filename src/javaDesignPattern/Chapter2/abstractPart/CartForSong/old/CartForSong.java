package javaDesignPattern.Chapter2.abstractPart.CartForSong.old;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CartForSong {
    List<Song> cart = new ArrayList<>();

    public double calculateTotalPrice(){
        double total = 0.0;
        Iterator<Song> e = cart.iterator();

        while(e.hasNext()){
            Song s = e.next();

            if(s.getDiscountMode().equals("OnSale")) {
                total = total + (s.getPrice() - 0.1 * s.getPrice());


            }else if (s.getDiscountMode().equals("TodayEvent")){
                total = total + (s.getPrice() - 0.3 * s.getPrice());

            }else total = total +  s.getPrice();

        }
        return  total;
    }

    public void add(Song s) {
        cart.add(s);
    }
}

