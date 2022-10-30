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
        newNode.next = this.head;
        this.head = newNode;
    }
}
