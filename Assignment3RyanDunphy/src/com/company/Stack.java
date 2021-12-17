package com.company;

public class Stack {
    int stackSize = 2;
    int stack[] = new int[stackSize];
    int top = 0;

    // Expand method for dynamic sizing
    private void expand(){
        int length = size();
        int newStack[] = new int[stackSize + 1];
        System.arraycopy(stack, 0, newStack, 0,length);
        stack = newStack;
        stackSize += 1;
    }
    // Push method
    public void push(int data)
    {
        if (size() == stackSize){
            expand();
        }
        stack[top] = data;
        top++;
    } // end of push method

    // Pop Method Start.
    public int pop()
    {
        int data = 0;

        if (isEmpty())
        {
            System.out.println("The stack is empty.");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    } // end of pop method.

    private void shrink() {
        int length = size();
        if(length <= stackSize){
            stackSize -= 1;
        }
        int newStack[] = new int[stackSize];
        System.arraycopy(stack, 0, newStack, 0,length);
        stack = newStack;

    }

    // Start of show method.
    public void show() {for (int n : stack) {System.out.println(n + " ");}
    } // End of show method

    // Start of size Method.
    public int size() { return top;} // end of size method.

    // Start of isEmpty Method.
    public boolean isEmpty(){ return top <= 0;} // End of isEmpty Method.
}
