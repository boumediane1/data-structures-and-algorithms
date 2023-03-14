package tech.othmane.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(8);
        binarySearchTree.insert(3);
        binarySearchTree.insert(10);
        binarySearchTree.insert(14);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);
        binarySearchTree.insert(4);
        binarySearchTree.insert(13);
        System.out.println(binarySearchTree.contains(14));
        System.out.println(binarySearchTree.contains(99));
    }
}
