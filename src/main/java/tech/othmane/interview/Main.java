package tech.othmane.interview;

import java.util.HashMap;

public class Main {
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int i : array1) {
            hashMap.put(i, true);
        }

        for(int i : array2) {
            if(hashMap.get(i) != null) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        int[] b = {3, 4, 5};
        System.out.println(itemInCommon(a, b));
    }
}
