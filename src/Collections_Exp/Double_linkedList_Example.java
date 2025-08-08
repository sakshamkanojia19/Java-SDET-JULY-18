package Collections_Exp;

// 🔹 Node class representing each element in the doubly linked list
class Node {
    String data;
    Node prev;
    Node next;

    Node(String data) {
        this.data = data;
    }
}

// 🔹 Custom Doubly Linked List implementation
class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    // ➕ Add element to the end of the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // ➕ Add element to the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // ➕ Add element to the end (alias of add)
    public void addLast(String data) {
        add(data);
    }

    // ❌ Remove first element
    public String removeFirst() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        String data = head.data;
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = tail = null;
        }
        size--;
        return data;
    }

    // ❌ Remove last element
    public String removeLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        String data = tail.data;
        if (tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            head = tail = null;
        }
        size--;
        return data;
    }

    // 🔄 Reverse the actual list (head ↔ tail)
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Swap head and tail
        if (temp != null) {
            head = temp.prev;
        }
    }

    // ❌ Clear the list
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // 🔍 Get element at index
    public String get(int index) {
        checkIndex(index);
        return nodeAt(index).data;
    }

    // 🔄 Set value at index
    public String set(int index, String newValue) {
        checkIndex(index);
        Node current = nodeAt(index);
        String oldValue = current.data;
        current.data = newValue;
        return oldValue;
    }

    // ❌ Remove element at index
    public String remove(int index) {
        checkIndex(index);
        Node current = nodeAt(index);

        if (current.prev != null) current.prev.next = current.next;
        else head = current.next;

        if (current.next != null) current.next.prev = current.prev;
        else tail = current.prev;

        size--;
        return current.data;
    }

    // 🔍 Index of a value
    public int indexOf(String value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if ((value == null && current.data == null) ||
                (value != null && value.equals(current.data))) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // ℹ️ Size of the list
    public int size() {
        return size;
    }

    // 🔎 Is list empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // 🖨️ Print list forward
    public void printList() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            if (current != null) System.out.print(", ");
        }
        System.out.println("]");
    }

    // 🖨️ Print list in reverse
    public void printReverse() {
        Node current = tail;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            current = current.prev;
            if (current != null) System.out.print(", ");
        }
        System.out.println("]");
    }

    // 🔧 Helper: Get node at index
    private Node nodeAt(int index) {
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    // 🔧 Helper: Check index bounds
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}
