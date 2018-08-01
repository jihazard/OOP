package javaDesignPattern.Chapter1.page26;

public class Person {
    private Phone[] phones;

    public Person() {
        this.phones = new Phone[2];
    }

    public Phone getPhones(int i) {
        if(i ==0 || i == 1) return phones[i];
        return null;
    }
}
