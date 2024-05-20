package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        for (int i = start; i < finish; i++) {
            start += i + 1;
        }
        return start;
    }

    public static void main(String[] args) {
       System.out.println(sum(0, 10));
       System.out.println(sum(3, 8));
       System.out.println(sum(1, 1));
    }
}
