// implement a stack

class Stack<T> {
    private val storage = arrayListOf<T>()

    fun push(item: T) {
        storage.add(item)
    }

    fun pop(): T? {
        if (storage.isEmpty()) {
            return null
        }
        return storage.removeAt(storage.size - 1)
    }

    fun peek(): T? {
        if (storage.isEmpty()) {
            return null
        }
        return storage[storage.size - 1]
    }

    fun isEmpty(): Boolean {
        return storage.isEmpty()
    }

    override fun toString(): String {
        return storage.toString()
    }
}

fun main(args: Array<String>) {
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack)
    println(stack.pop())
    println(stack)
    println(stack.peek())
    println(stack)
    println(stack.isEmpty())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.isEmpty())
}
