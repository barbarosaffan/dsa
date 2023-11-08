#include <iostream>

struct Node
{
    int data;
    Node *prev;
    Node *next;

    Node(int data) : data(data), prev(nullptr), next(nullptr) {}
};

class DoublyLinkedList
{
private:
    Node *head;
    Node *tail;

public:
    DoublyLinkedList() : head(nullptr), tail(nullptr) {}

    ~DoublyLinkedList()
    {
        while (head != nullptr)
        {
            Node *temp = head;
            head = head->next;
            delete temp;
        }
    }

    void insertFront(int data)
    {
        Node *newNode = new Node(data);

        newNode->next = head;

        if (head != nullptr)
        {
            head->prev = newNode;
        }
        head = newNode;
        if (tail == nullptr)
        {
            tail = newNode;
        }
    }

    void insertBack(int data)
    {
        Node *newNode = new Node(data);

        if (tail != nullptr)
        {
            tail->next = newNode;
            newNode->prev = tail;
            tail = newNode;
        }
        else
        {
            head = tail = newNode;
        }
    }

    void displayForward()
    {
        Node *current = head;
        while (current != nullptr)
        {
            std::cout << current->data << " ";
            current = current->next;
        }
        std::cout << std::endl;
    }

    void displayBackward()
    {
        Node *current = tail;
        while (current != nullptr)
        {
            std::cout << current->data << " ";
            current = current->prev;
        }
        std::cout << std::endl;
    }
};

int main()
{
    DoublyLinkedList dll;

    dll.insertFront(10);
    dll.insertFront(20);
    dll.displayForward();
    dll.insertBack(30);
    dll.insertBack(40);
    dll.displayForward();
}