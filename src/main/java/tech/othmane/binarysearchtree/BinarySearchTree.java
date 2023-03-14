package tech.othmane.binarysearchtree;

public class BinarySearchTree {
    private Node root;
    static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if(this.root == null) {
            this.root = newNode;
            return true;
        }

        Node temp = this.root;

        while(true) {
            if(value == temp.value) return false;

            if(value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = this.root;

        while(temp != null) {
            if(temp.value == value) {
                return true;
            }

            if(value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "\n\troot=" + root +
                "\n}";
    }
}
