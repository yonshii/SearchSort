package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 15;
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(150);
        }

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));

        int b = array[random.nextInt(a)];
        System.out.println("Item to search for: " + b);

        int result = ArrayUtils.binarySearch(array, b);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }
}