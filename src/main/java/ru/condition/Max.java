package ru.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int first, int second, int third) {
       return max(max(first, second), third);
    }

    public int max(int first, int second, int third, int forth) {
        return max(max(first, second), max(third, forth));
    }

    public static void main(String[] args) {
      Max maximum = new Max();
       System.out.println(maximum.max(1, 5, 3));
       System.out.println(maximum.max(4, 2, 7, 1));
    }
}
