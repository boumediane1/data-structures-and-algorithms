package tech.othmane.sorts;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] numbers) {
        for(int i = numbers.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 1};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
