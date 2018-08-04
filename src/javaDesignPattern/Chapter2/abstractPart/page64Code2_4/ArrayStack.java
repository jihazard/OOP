package javaDesignPattern.Chapter2.abstractPart.page64Code2_4;

public class ArrayStack {

    public int top;
    public int[] itemArray;
    public int stackSize;

    public ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        itemArray = new int[stackSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.stackSize - 1);

    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("insert fail! array Stack is full");
        } else {
            itemArray[++top] = item;
            System.out.println("Inserted Item :" + item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("delete fail ! arrayStack is empyt() ");
            return -1;
        } else {
            return itemArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("empyt peeking fail");
            return -1;
        } else {
            return itemArray[top];
        }
    }
}

   class StackCient {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(10);
        st.itemArray[++st.top] = 20;
        System.out.println(st.itemArray[st.top]);
    }}

