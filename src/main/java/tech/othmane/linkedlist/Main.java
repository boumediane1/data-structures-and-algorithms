package tech.othmane.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println(linkedList.insert(0, 9));

        System.out.println(linkedList);
        linkedList.printList();
    }
}