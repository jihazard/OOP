package javaDesignPattern.Chapter1.page29_1_14Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private List<Transcript> transcriptList;
    private String name;

    public Student(String name) {
        this.name = name;
        this.transcriptList = new ArrayList<>();
    }

    public void addTranscript(Transcript transcript) {
        transcriptList.add(transcript);
    }

    public List<Course> getCourse(){
        List<Course> course= new ArrayList<>();
        Iterator<Transcript> itor = transcriptList.iterator();

        while(itor.hasNext()){
            Transcript tr = itor.next();
            course.add(tr.getCourse());
        }
        return course;

    }
}
