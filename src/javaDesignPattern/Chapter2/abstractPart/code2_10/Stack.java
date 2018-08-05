package javaDesignPattern.Chapter2.abstractPart.code2_10;

import java.util.ArrayList;
import java.util.Vector;

public class Stack {

}


class MyStack<String>  {

    private ArrayList<String> arList =  new ArrayList<>();
    private Vector<String> vt = new Vector<>();


    public void push(String element){
        arList.add(element);
        vt.add(element);
    }

    public String pop(){
        String returnValue = vt.remove(vt.size()-1);

        return returnValue;

    }

    public boolean isEmpty() {
        return vt.isEmpty();
    }

    public int size() {
        return vt.size();

    }
}
