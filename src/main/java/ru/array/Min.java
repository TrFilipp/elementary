package ru.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
