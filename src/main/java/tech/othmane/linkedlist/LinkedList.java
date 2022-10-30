package tech.othmane.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public LinkedList (int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void printList () {
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.length++;
    }

    public Node removeLast () {
        if (this.length == 0) return null;

        Node temp = this.head;
        Node pre = this.head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        length--;

        if (length == 0) {
            this.head = null;
            this.tail = null;
        }

        return temp;
    }

    public void prepend (int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst () {
        if (this.length == 0) return null;

        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }

        return temp;
    }

    public Node get (int index) {
        if (index < 0 || index >= length) return null;

        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void set (int index, int value) {

        if (index < 0 || index >= this.length) return;

        Node temp = this.head;
        Node pre = this.head;

        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = this.head;
            this.head = newNode;
            this.tail = newNode;
        } else {
            pre.next = newNode;
            newNode.next = temp;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{\n" +
                "\thead=" + head +
                ",\n\ttail=" + tail +
                ",\n\tlength=" + length +
                "\n}";
    }
}
