package tech.othmane.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();

        System.out.println(linkedList);
        linkedList.printList();
    }
}