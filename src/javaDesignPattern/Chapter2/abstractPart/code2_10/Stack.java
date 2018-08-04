package javaDesignPattern.Chapter2.abstractPart.code2_10;

import java.util.ArrayList;

public class Stack {

}


class MyStack<String>  {

    private ArrayList<String> arList =  new ArrayList<>();

    public void push(String element){
        arList.add(element);
    }

    public String pop(){
        return arList.remove(arList.size() -1);
    }

    public boolean isEmpty() {
        return arList.isEmpty();
    }

    public int size() {
        return arList.size();

    }
}
