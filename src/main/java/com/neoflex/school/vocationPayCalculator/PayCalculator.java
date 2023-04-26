package com.neoflex.school.vocationPayCalculator;

public class PayCalculator {
    private static final int DAYS_IN_MONTH = 30;

    public static double calculate(double avgPay, int n) {
        return n*avgPay/(double) DAYS_IN_MONTH;
    }
}
