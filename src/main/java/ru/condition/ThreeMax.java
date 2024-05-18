package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (third > first && third > second) {
            result = third;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (first == second && first > third) {
            result = second;
        } else if (second == third && second > first) {
            result = third;
        }

        return result;
    }

}
