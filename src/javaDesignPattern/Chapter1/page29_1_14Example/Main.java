package javaDesignPattern.Chapter1.page29_1_14Example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student kim = new Student("dukhyun");
        Student  yoon = new Student("jihwan");

        Course  se = new Course("컴퓨터공학");
        Course  dp = new Course("디자인패턴");

        Transcript t1 = new Transcript(kim,se);
        Transcript t2 = new Transcript(yoon,se);
        Transcript t3 = new Transcript(yoon,dp);

        t1.setDate("2018");
        t1.setGrade("A");

        t2.setDate("2018");
        t2.setGrade("b");

        t3.setDate("2018");
        t3.setGrade("c");

        List<Course> course;
        course = yoon.getCourse();
        for(int i =0 ; i<=course.size()-1;i++){
            System.out.println(course.get(i).getName());
        }

        for(Course c : course){
            System.out.println("과목 :" + c.getName());
        }

    }
}
