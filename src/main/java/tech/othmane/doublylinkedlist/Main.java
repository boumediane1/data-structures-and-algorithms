package tech.othmane.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);
        System.out.println(doublyLinkedList.get(2));
        System.out.println(doublyLinkedList.get(3));
    }
}