#include <iostream>

using namespace std;

#define STACK_SIZE 100

class Stack
{
private:
    int stack[STACK_SIZE];
    int top = -1;

public:
    void push(int item)
    {
        if (top >= STACK_SIZE - 1)
        {
            cout << "Stack Overflow" << endl;
            return;
        }
        top++;
        stack[top] = item;
    }

    void pop()
    {
        if (top <= -1)
        {
            cout << "Stack Underflow" << endl;
            return;
        }
        top--;
    }

    void peek()
    {
        cout << "TOP: " << top << endl;
        cout << "Peek Top: " << stack[top] << endl;
    }

    bool isEmpty()
    {
        return top == 0;
    }

    bool isFull()
    {
        return top == STACK_SIZE;
    }

    void print()
    {
        if (top >= 0)
        {
            for (int i = 0; i <= top; i++)
            {
                cout << "Index " << i << ": " << stack[i] << endl;
            }
        }
    }
};

int main()
{
    cout << "stack implementation" << endl;

    Stack s;

    cout << "Is empty?: " << s.isEmpty() << endl;

    s.push(10);

    cout << "Is empty?: " << s.isEmpty() << endl;

    s.push(20);
    s.push(30);
    s.pop();
    s.push(40);
    s.push(50);

    s.peek();

    s.print();
};
