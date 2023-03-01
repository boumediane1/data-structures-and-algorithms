package tech.othmane.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.set(1, 9);
        System.out.println(doublyLinkedList);
    }
}