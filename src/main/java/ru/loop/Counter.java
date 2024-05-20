package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int startPlusI = 0;
        for (int i = start; i <= finish; i++) {
             startPlusI += i;
        }
        return startPlusI;
    }

    public static void main(String[] args) {
       System.out.println(sum(0, 10));
       System.out.println(sum(3, 8));
       System.out.println(sum(1, 1));
    }
}
