package tech.othmane.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);

        System.out.println(linkedList.get(2));

        System.out.println(linkedList);
        linkedList.printList();
    }
}