package tech.othmane.stack;

public class Stack {
    private Node top;
    private int height;

    static class Node {
        int value;
        Node next;

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

    public Stack(int value) {
        this.top = new Node(value);
        this.height = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);

        if (this.height > 0) {
            newNode.next = this.top;
        }

        this.top = newNode;

        this.height++;
    }

    @Override
    public String toString() {
        return "Stack{\n" +
                "\ttop=" + top +
                ",\n\theight=" + height +
                "\n}";
    }
}
