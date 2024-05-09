package ru.condition;

public class Point {
    public static double distant(int x1, int y1, int x2, int y2) {
       return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

    public static void main(String[] args) {
        double result = distant(5, 6, 2, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
