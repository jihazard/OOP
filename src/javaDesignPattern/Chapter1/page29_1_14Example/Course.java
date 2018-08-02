package javaDesignPattern.Chapter1.page29_1_14Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course {
    private List<Transcript> transcriptList;
    private String name;

    public Course(String name) {
        this.name = name;
        this.transcriptList = new ArrayList<>();
    }



    public void addTranscript(Transcript transcript) {
        transcriptList.add(transcript);
    }

    public String getName() {
        return name;
    }


}
