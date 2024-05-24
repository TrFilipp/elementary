package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        percent /= 100;
        while ((amount * percent + amount) - salary > 0) {
            amount += amount * percent;
            amount %= salary;
            year++;
        }
        return year;
    }
}
