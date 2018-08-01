package javaDesignPattern.Chapter1.page27;

public class Main {
    public static void main(String[] args) {
        Professor hong = new Professor();
        Student kim = new Student();

        hong.setStudent(kim);
        hong.advise();
    }

}
