package com.company;

public class Main {

    public static void main(String[] args) {
	// adding new nodes.
        Link list = new Link(new Node(413));
        list.print();

        System.out.println("");
        list.append(new Node(25));
        list.insertAt(new Node(37), 1);
        list.insertAt(new Node(13), 2);
        list.print();

        System.out.println("");
        list.insertNewRoot(new Node(1));
        list.print();
    }
}
