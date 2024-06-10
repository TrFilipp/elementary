package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = 0;
        int minIndex = 0;
        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            minIndex = FindLoop.indexInRange(data, min, i, data.length - 1);
            if (data[minIndex] < data[i]) {
                SwitchArray.swap(data, minIndex, i);
            }
        }
        return data;
    }
}
