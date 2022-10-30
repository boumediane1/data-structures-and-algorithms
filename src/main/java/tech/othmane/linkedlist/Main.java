package tech.othmane.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.set(2, 9);

        System.out.println(linkedList);
        linkedList.printList();
    }
}