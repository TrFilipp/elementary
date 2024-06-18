package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int j = array.length - 1;
        int i = 0;
        while (i < j) {
            if (array[i] + array[j] > target) {
                j--;
            } else if (array[i] + array[j] < target) {
                i++;
            } else if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
