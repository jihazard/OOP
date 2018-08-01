package javaDesignPattern.Chapter1.page27;

public class Student {
    private Professor professor;

    public void setAdvise(Professor professor) {
        this.professor = professor;
    }

    public void advise(String msg) {
        System.out.println(msg);
    }
}
