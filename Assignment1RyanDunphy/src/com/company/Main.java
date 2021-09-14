package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	    Listing testListing = new Listing("Ryan", 26);
        System.out.println(testListing.getStudentName());

        Listing testListing2 = new Listing();
        System.out.println(testListing2.getStudentAge());

        testListing.setStudentName("John");
        testListing2.setStudentAge(12);

        System.out.println(testListing.getStudentName());
        System.out.println(testListing2.getStudentAge());
    }
}
