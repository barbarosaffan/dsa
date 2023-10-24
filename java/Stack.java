// implement a stack

public class Stack {
    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    // put item on top of stack
    public void push(long j) {
        stackArray[++top] = j;
    }

    // take item from top of stack
    public long pop() {
        return stackArray[top - 1];
    }

    // peek at top of stack
    public long peek() {
        return stackArray[top];
    }

    // true if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // true if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

// run them

class StackImplementation {
    public static void main(String[] args) {
        Stack theStack = new Stack(10); // make new stack
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) { // until it's empty
            long value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        }
        System.out.println();
    }
}
