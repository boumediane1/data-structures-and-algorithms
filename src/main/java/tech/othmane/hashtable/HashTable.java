package tech.othmane.hashtable;

import java.util.Arrays;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    static class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public HashTable() {
        this.dataMap = new Node[this.size];
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % this.dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);

        Node newNode = new Node(key, value);

        if(this.dataMap[index] == null) {
            this.dataMap[index] = newNode;
        } else {
            Node temp = this.dataMap[index];

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "\n\tsize=" + size +
                ",\n\tdataMap=" + Arrays.toString(dataMap) +
                "\n}";
    }
}
