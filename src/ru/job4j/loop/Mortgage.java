package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
//        while (amount >= 0) {
//            amount = (amount / 100 * (100 + percent) - salary);
//            year++;
//        }
//        ИЛИ
        for (int i = 1; i > 0; i++) {
            amount = (amount / 100 * (100 + percent) - salary);
            year++;
            if (amount <= 0) {
                break;
            }
        }
        return year;
    }
}