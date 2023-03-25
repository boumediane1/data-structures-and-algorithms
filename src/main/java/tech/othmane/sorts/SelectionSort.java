package tech.othmane.sorts;

import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 8, 2, 4, 3, 7, 6, 10, 9};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
