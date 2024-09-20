public class Stack {
    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        if (!isFull()) {
            stackArray[++top] = j;
        } else {
            System.out.println("Stack is full, cannot push " + j);
        }
    }

    public long pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty, cannot pop");
            return -1; // Return a sentinel value or throw an exception
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty, cannot peek");
            return -1; // Return a sentinel value or throw an exception
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class StackImplementation {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Stack is empty: " + theStack.isEmpty());
    }
}
