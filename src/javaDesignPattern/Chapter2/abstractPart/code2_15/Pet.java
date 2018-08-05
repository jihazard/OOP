package javaDesignPattern.Chapter2.abstractPart.code2_15;

public abstract class Pet {
    public abstract void talk();
}

class Cat extends  Pet {

    @Override
    public void talk() {
        System.out.println("야옹");
    }
}

class Dog extends  Pet {

    @Override
    public void talk() {
        System.out.println("멍멍");
    }
}



class Main {

    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();

        dog.talk();
        cat.talk();
    }
}