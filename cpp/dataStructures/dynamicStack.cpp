#include <iostream>
#include <vector>

using namespace std;

class Stack
{
private:
    vector<int> stack;

public:
    void push(int);
    void pop();
    int top();
    bool empty();
};

void Stack::push(int x)
{
    stack.push_back(x);
}

void Stack::pop()
{
    stack.pop_back();
}

int Stack::top()
{
    return stack.back();
}

bool Stack::empty()
{
    return stack.empty();
}

int main()
{
    Stack s;
    s.push(333);
    s.push(61);
    s.push(1);
    cout << s.top() << endl;
    s.pop();
    cout << s.top() << endl;
    s.pop();
    cout << s.top() << endl;
    s.pop();
    cout << s.empty() << endl;
    return 0;
};
