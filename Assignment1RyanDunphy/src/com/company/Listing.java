package com.company;
import java.io.*;

// Create Listing class.

public class Listing {
    private String studentName;
    private int studentAge;

    public Listing() {
        studentName = "Ryan";
        studentAge = 26;
    }

    public Listing(String name, int age){
        studentName = name;
        studentAge = age;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String newName){
        this.studentName = newName;
    }

    public int getStudentAge(){
        return studentAge;
    }

    public void setStudentAge(int newAge){
        this.studentAge = newAge;
    }

}
