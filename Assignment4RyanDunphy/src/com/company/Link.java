package com.company;

public class Link {
    private Node root;
    private Node last;
    private int size;

    public Link(Node node){
        this.root = node;
        this.last = node;
        this.size = 1;
    }

    public void append(Node node){
        last.setNextNode(node);
        last = node;
        size = size + 1;
    }
    private Node getNode(int position, boolean shouldPrint) {
        Node indexWalker = root;
        for (int i = 0; i < position; i++) {
            if (shouldPrint = true) {
                System.out.println(indexWalker.getValue());
            }
            indexWalker = indexWalker.getNextNode();
        }
        return indexWalker;
    }
    public Node insertAt(Node newNode, int position){
        Node priorNode = getNode(position - 1, false);
        newNode.setNextNode(priorNode.getNextNode());
        priorNode.setNextNode(newNode);
        size = size + 1;
        return newNode;
    }
    public Node insertNewRoot(Node newRoot){
        newRoot.setNextNode(root);
        root = newRoot;
        size = size + 1;
        return newRoot;
    }
    public void print(){
        getNode(size, true);
    }
}
