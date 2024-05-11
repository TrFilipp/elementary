package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 1.4f;
        float expectedDollar = 1.56f;
        float outEuro = rubleToEuro(in);
        float outDollar = rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 1.4 Euro. Test result: " + passedEuro);
        System.out.println("140 rubles are 1,56 Dollar. Test result: " + passedDollar);

    }
}
