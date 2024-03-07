package ds

import "fmt"

type Stack struct {
	items []int
	top   int
}

func (stack *Stack) push(item int) {

	if len(stack.items) == 0 {
		stack.top = item
		stack.items = append(stack.items, item)
	}
	stack.items = append(stack.items, item)
}

func (stack *Stack) pop() int {
	if !(len(stack.items) > 0) {
		return 0
	}

	poppedItem := stack.items[len(stack.items)-1]
	stack.items = stack.items[:len(stack.items)-1]

	return poppedItem
}

func (stack *Stack) peek() {
	fmt.Println(stack.items, stack.top)
}

func StackImplementation() {
	stack := Stack{}

	stack.push(1)
	stack.push(2)
	stack.push(3)

	stack.peek()

	stack.pop()
	stack.pop()

	fmt.Println(stack.items)
}
