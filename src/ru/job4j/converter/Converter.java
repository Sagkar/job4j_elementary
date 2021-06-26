package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void test() {
        System.out.println("Test : ");
        int in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float expected2 = 2.3333333f;
        float out2 = rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2.3333333 dollars. Test result : " + passed2);

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars");
        test();
    }
}