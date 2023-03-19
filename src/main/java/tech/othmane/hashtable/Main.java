package tech.othmane.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);
        System.out.println(hashTable);
        System.out.println(hashTable.keys());
    }
}
