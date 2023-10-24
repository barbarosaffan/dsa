#include <iostream>

class Node
{
public:
    int data;
    Node *next;

    Node()
    {
        data = 0;
        next = NULL;
    };

    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    };
};

class LinkedList
{
private:
    Node head;

public:
    LinkedList()
    {
        this->head = NULL;
    };
    void insertNode(int data)
    {
        Node *n = new Node(data);

        if (head == NULL)
        {
            head = n;
            return;
        }
    }
};

int main()
{
}