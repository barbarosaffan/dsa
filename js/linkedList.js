class Node {
  constructor(data) {
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}

class DoublyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  append(data) {
    const newNode = new Node(data);

    if (!this.head) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.next = newNode;
      newNode.prev = this.tail;
      this.tail = newNode;
    }

    this.length++;
  }

  prepend(data) {
    const newNode = new Node(data);

    if (!this.head) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.next = this.head;
      this.head.prev = newNode;
      this.head = newNode;
    }

    this.length++;
  }

  remove(data) {
    let current = this.head;

    while (current) {
      if (current.data === data) {
        if (current.prev) {
          current.prev.next = current.next;
        } else {
          this.head = current.next;
        }

        if (current.next) {
          current.next.prev = current.prev;
        } else {
          this.tail = current.prev;
        }

        this.length--;
        return true;
      }

      current = current.next;
    }

    return false;
  }

  find(data) {
    let current = this.head;

    while (current) {
      if (current.data === data) {
        return current;
      }

      current = current.next;
    }

    return null;
  }

  insertAfter(data, newData) {
    let current = this.find(data);

    if (current) {
      const newNode = new Node(newData);

      newNode.next = current.next;
      newNode.prev = current;
      current.next = newNode;

      if (newNode.next) {
        newNode.next.prev = newNode;
      } else {
        this.tail = newNode;
      }

      this.length++;
      return true;
    }

    return false;
  }

  insertBefore(data, newData) {
    let current = this.find(data);

    if (current) {
      const newNode = new Node(newData);

      newNode.prev = current.prev;
      newNode.next = current;
      current.prev = newNode;

      if (newNode.prev) {
        newNode.prev.next = newNode;
      } else {
        this.head = newNode;
      }

      this.length++;
      return true;
    }

    return false;
  }

  printList() {
    let current = this.head;
    let result = '';

    while (current) {
      result += `${current.data} <-> `;
      current = current.next;
    }

    return result.slice(0, -5);  // Removes the last arrow and spaces
  }

  toArray() {
    let current = this.head;
    const array = [];

    while (current) {
      array.push(current.data);
      current = current.next;
    }

    return array;
  }
}

// Example usage:
const list = new DoublyLinkedList();
list.append(1);
list.append(2);
list.append(3);
list.prepend(0);
list.insertAfter(2, 2.5);
list.insertBefore(2, 1.5);

console.log(list.printList()); // 0 <-> 1 <-> 1.5 <-> 2 <-> 2.5 <-> 3
console.log(list.toArray());    // [0, 1, 1.5, 2, 2.5, 3]
