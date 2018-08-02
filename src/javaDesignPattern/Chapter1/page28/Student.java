package javaDesignPattern.Chapter1.page28;

import javaDesignPattern.Chapter1.Course;

import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
    }

    public void registerCourse(Course course) {
        this.courses.add(course);
    }

    public void dropCourse(Course course) {
        if(this.courses.contains(course)){
            this.courses.remove(course);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}
