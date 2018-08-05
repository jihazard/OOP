package javaDesignPattern.Chapter2.abstractPart.CartForSong.abstrac;


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

            total += total + s.getPrice();
        }
        return  total;
    }

    public void add(Song s) {
       cart.add(s);
    }
}
