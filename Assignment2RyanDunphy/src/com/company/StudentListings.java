package com.company;

import javax.swing.*;

public class StudentListings {
    private String name; // key field
    private String address;
    private String number;
    public StudentListings(String n, String a, String num)
    {
        name = n;
        address = a;
        number = num;
    }
    public StudentListings()
    {

    }
    public String toString()
    {
        return("Name is " + name + "\nAddress is " + address +
                "\nNumber is " + number + "\n");
    }
    public StudentListings deepCopy()
    {
        StudentListings clone = new StudentListings(name, address, number);
        return clone;
    }
    public int compareTo(String targetKey)
    {
        return(name.compareToIgnoreCase(targetKey));
    }
    public void input()
    {
        name = JOptionPane.showInputDialog("Enter a name");
        address = JOptionPane.showInputDialog("Enter an address");
        number = JOptionPane.showInputDialog("Enter a number");
    } // end of input StudentListings method.
}   // End of class StudentListings
