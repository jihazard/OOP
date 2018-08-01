package javaDesignPattern.Chapter1.page27;

public class Professor {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
        student.setAdvise(this);
    }

    public void advise() {
        student.advise("상담 내용은 여기에...");
    }
}
