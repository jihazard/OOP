package javaDesignPattern.Chapter2.abstractPart.page64Code2_4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack {
        private int top;
        private List<Integer> items;
        private int stackSize;

    public ArrayListStack(int stackSize) {
        this.stackSize = stackSize;
        top=-1;
        this.items = new ArrayList<>();
    }

    public int getTop() {
        return top;
    }

    public ArrayListStack setTop(int top) {
        this.top = top;
        return this;
    }

    public List<Integer> getItems() {
        return items;
    }

    public ArrayListStack setItems(List<Integer> items) {
        this.items = items;
        return this;
    }

    public int getStackSize() {
        return stackSize;
    }

    public ArrayListStack setStackSize(int stackSize) {
        this.stackSize = stackSize;
        return this;
    }
}

class StackClient{
    public static void main(String[] args) {
        ArrayListStack st = new ArrayListStack(10);

        /*st.items.add(new Integer(20));
        System.out.println(st.items.get(st.items.size()-1));*/
    }
}
