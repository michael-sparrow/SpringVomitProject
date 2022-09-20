package com.example.myOwnProject.allTheThigs;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Component
public class Vomit {

    @Id
    @SequenceGenerator(name="student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "student_sequence")
    private long id;
    private String color;
    private String consistence;
    private int smellRate;

    public String vomit(){
        return "Blaargh";
    }


}
