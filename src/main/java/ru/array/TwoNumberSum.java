package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int j = 0;
        int i = 0;
        while (j < array.length - 1) {
            if (array[i] + array[j + 1] == target) {
                return new int[]{i, j + 1};
            }
            j++;
            if (j + 1 == array.length - 1) {
                i++;
                j = i;
            }
        }
        return new int[0];
    }
}
