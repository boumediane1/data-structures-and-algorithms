package tech.othmane.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    static class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    // ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    public DoublyLinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
        this.length++;
    }

    public Node removeLast() {
        if (this.length == 0) return null;

        Node temp = this.tail;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
            temp.prev = null;
        }

        this.length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) return null;

        Node temp = this.head;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
            temp.next = null;
        }

        this.length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > this.length - 1) return null;
        Node temp = this.head;
        if (this.length / 2 > index) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp == null) return false;
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == this.length) {
            append(value);
            return true;
        }

        Node temp = get(index);
        Node newNode = new Node(value);

        temp.prev.next = newNode;
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev = newNode;

        this.length++;
        return true;
    }

    public Node remove(int index) {
        Node temp = get(index);

        if (temp == null) return null;
        if (index == 0) return removeFirst();
        if (index == this.length - 1) return removeLast();

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;

        this.length--;
        return temp;
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{\n" +
                "\thead=" + head +
                ",\n\ttail=" + tail +
                ",\n\tlength=" + length +
                "\n}";
    }
}
