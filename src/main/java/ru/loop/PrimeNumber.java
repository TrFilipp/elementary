package ru.loop;

public class PrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check(i)) {
            count++;
            }
        }
        return count;
    }
}
