package tech.othmane.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);

        linkedList.removeLast();

        linkedList.prepend(1);
        linkedList.prepend(2);
        linkedList.prepend(3);

        linkedList.printList();
    }
}