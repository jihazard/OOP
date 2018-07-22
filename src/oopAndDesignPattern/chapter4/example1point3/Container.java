package oopAndDesignPattern.chapter4.example1point3;

import java.util.ArrayList;

public class Container extends ArrayList<Luggage> {

    private int maxSize;
    private int currentSize;

    public Container( int maxSize) {
        this.maxSize = maxSize;
    }

    public void put(Luggage lug) throws NotEnoughSpaceException{
        if(!canContain(lug)){
            throw new NotEnoughSpaceException();
           /* super.add(lug);
            currentSize += lug.size();*/
        }
    }

    public void extract(Luggage lug) {
        super.remove(lug);
        this.currentSize -= lug.size();
    }

    private boolean canContain(Luggage lug) {
        return maxSize >= currentSize + lug.size();
    }
}
