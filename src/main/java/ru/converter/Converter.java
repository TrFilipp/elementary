package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(190);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("190 rubles are " + dollar + " dollar. ");
    }
}
