package ru.condition;

public class Point {
    public static double distant(int x1, int y1, int x2, int y2) {
        double x2MinusX1 = x2 - x1;
        double rslX = Math.pow(x2MinusX1, 2);
        double y2MinusY1 = y2 - y1;
        double rslY = Math.pow(y2MinusY1, 2);
        double rslXPlusY = rslX + rslY;
        return Math.sqrt(rslXPlusY);

    }

    public static void main(String[] args) {
        double result = distant(5, 6, 2, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
