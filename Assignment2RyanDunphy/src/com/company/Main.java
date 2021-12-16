package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Testing StudentListing Class");
        StudentListings testStudent1 = new StudentListings(
                "Ryan", "123 Gee Drive", "413");
        // Test first methods.
        System.out.println(testStudent1);
        System.out.println(testStudent1);
        // Test default constructor and
        StudentListings testStudent2 = new StudentListings();
        testStudent2.input();

        System.out.println(testStudent2);
        int flag = testStudent2.compareTo("Bob");
        testStudent2.deepCopy();
        if (flag == 0)
        {
            System.out.println("Bob is there in the list");
        }
        else
            System.out.println("Bob is not there in the list");

        Sort testArray1 = new Sort
                (new StudentListings("David", "123 Billy Road", "413"));
        testArray1.insert
                (new StudentListings("John", "712 Hager Road", "82"),
                        1);
        testArray1.print();
    }
}
