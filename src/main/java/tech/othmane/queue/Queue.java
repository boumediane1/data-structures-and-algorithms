package tech.othmane.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
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

    public Queue(int value) {
        this.first = new Node(value);
        this.last = this.first;
        this.length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.length == 0) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }

        this.last = newNode;

        this.length++;
    }

    @Override
    public String toString() {
        return "Queue{\n" +
                "\tfirst=" + first +
                ",\n\tlast=" + last +
                ",\n\tlength=" + length +
                "\n}";
    }
}
