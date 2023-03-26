package tech.othmane.sorts;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] numbers) {
        for(int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];

            int j = i - 1;

            while(j > -1 && temp < numbers[j]) {
                numbers[j + 1] = numbers[j];
                numbers[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 8, 2, 4, 3, 7, 6, 10, 9};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
