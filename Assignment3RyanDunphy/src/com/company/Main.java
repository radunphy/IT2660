package com.company;

public class Main {

    public static void main(String[] args) {
	// driver program
        Stack firstStack = new Stack();
        firstStack.push(23);
        firstStack.push(13);
        firstStack.push(1);

        System.out.println("First Array");
        firstStack.show();

        firstStack.push(17);
        firstStack.push(42);

        System.out.println("Second Array:");
        firstStack.show();

        firstStack.pop();
        System.out.println("Third Array:");
        firstStack.show();
    }
}
