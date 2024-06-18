package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int j = array.length - 1;
        int i = 0;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
