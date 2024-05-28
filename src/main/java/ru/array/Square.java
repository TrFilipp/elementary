package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] pow = new int[bound];
        for (int i = 0; i < bound; i++) {
            pow[i] = i * i;
        }
        return pow;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
