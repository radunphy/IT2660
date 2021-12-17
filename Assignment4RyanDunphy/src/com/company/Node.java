package com.company;

public class Node {
    private int value;
    private Node next;

    public Node (int value) { this.value = value; }
    public int getValue() { return this.value; }
    public Node getNextNode() { return this.next; }
    public void setNextNode (Node node) { this.next = node; }


}
