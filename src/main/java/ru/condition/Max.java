package ru.condition;

public class Max {

    public int max(int first, int second, int third) {
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

    public int max(int first, int second, int third, int forth) {
        int result = first;
        if (third > first && third > second && third > forth) {
            result = third;
        }
        if (second > first && second > third && second > forth) {
            result = second;
        }
        if (forth > first && forth > second && forth > third) {
            result = forth;
        }
        if (first == second && first > third && first > forth) {
            result = second;
        } else if (second == third && second > first && second > forth) {
            result = third;
        } else if (third == forth && third > first && third > second) {
            result = forth;
        }
        return result;
    }

    public static void main(String[] args) {
       Max maximum = new Max();
       System.out.println(maximum.max(1, 5, 3));
       System.out.println(maximum.max(4, 2, 7, 1));
    }
}
