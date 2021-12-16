package com.company;
import java.util.Scanner;
import javax.swing.*;

public class Sort {

    private StudentListings[] studentArray;

    public Sort(StudentListings firstStudent)
    {
        this.studentArray = new StudentListings[1];
        this.studentArray[0] = firstStudent;
    }
    public void print(){
        for (StudentListings student: this.studentArray){
            System.out.println(student.toString());
        }
    }
    public void insert(StudentListings student, int position){

        // Empty array insert
        if (this.studentArray.length == 0 && position == 0){
            this.studentArray = new StudentListings[1];
            this.studentArray[0] = student;
            return;
        }

        // Error Checking
        if (position < 0 || position > this.studentArray.length){
            return;
        }

        // Adding new arrays elements and dynamically assigning memory
        StudentListings[] newStudentArray = new StudentListings[this.studentArray.length + 1];

        // For loop to set condition.
        for (int i=0; i<this.studentArray.length+1; i++) {
            if (i < position){
                newStudentArray[i] = this.studentArray[i];
            } else if (i > position) {
                newStudentArray[i] = this.studentArray[i - 1];
            }
            else {
                newStudentArray[i] = student;
            }
        }
    }
}   // End of class StudentListings
