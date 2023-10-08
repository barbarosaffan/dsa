namespace cs.DataStructures;

public class Stack
{
    private readonly int[] _stack;
    private int _top = -1;

    private Stack(int size)
    {
        _stack = new int[size];
    }

    private void Push(int value)
    {
        if (_top == _stack.Length - 1)
        {
            throw new Exception("Stack overflow");
        }

        _stack[++_top] = value;
    }
    
    private int Pop()
    {
        if (_top == -1)
        {
            throw new Exception("Stack underflow");
        }

        return _stack[_top--];
    }
    
    private int Peek()
    {
        if (_top == -1)
        {
            throw new Exception("Stack underflow");
        }

        return _stack[_top];
    }
    
    private bool IsEmpty()
    {
        return _top == -1;
    }
    
    private bool IsFull()
    {
        return _top == _stack.Length - 1;
    }

public static void Main()
    {
        var stack = new Stack(5);
        
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);
        
        Console.WriteLine($"Is Full: {stack.IsFull()} ");

        stack.Pop();
        var popped = stack.Pop();
        Console.WriteLine($"Popped: {popped}");
        
        Console.WriteLine($"Is Empty: {stack.IsEmpty()}");

        Console.WriteLine($"Peeking: {stack.Peek()}");
    }
}
