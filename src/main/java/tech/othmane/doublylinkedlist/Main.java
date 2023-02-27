package tech.othmane.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.removeLast();
        // doublyLinkedList.append(2);
        // doublyLinkedList.append(3);
        doublyLinkedList.prepend(0);
        System.out.println(doublyLinkedList);
    }
}