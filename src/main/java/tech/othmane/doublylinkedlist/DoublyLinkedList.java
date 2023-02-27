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

    @Override
    public String toString() {
        return "DoublyLinkedList{\n" +
                "\thead=" + head +
                ",\n\ttail=" + tail +
                ",\n\tlength=" + length +
                "\n}";
    }
}
