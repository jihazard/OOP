package javaDesignPattern.Chapter1.page29_1_14Example;

public class Transcript {
    private Student student;
    private Course course;
    private String date;
    private String grade;

    public Transcript(Student student, Course course) {
        this.student = student;
        this.student.addTranscript(this);
        this.course = course;
        this.course.addTranscript(this);
    }

    public Student getStudent() {
        return student;
    }

    public Transcript setStudent(Student student) {
        this.student = student;
        return this;
    }

    public Course getCourse() {
        return course;
    }

    public Transcript setCourse(Course course) {
        this.course = course;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Transcript setDate(String date) {
        this.date = date;
        return this;
    }

    public String getGrade() {
        return grade;
    }

    public Transcript setGrade(String grade) {
        this.grade = grade;
        return this;
    }
}
