package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double cleavageAndMinus(double first, double second) {
        return minus(first, second)
                + cleavage(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + cleavage(first, second)
                + minus(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
