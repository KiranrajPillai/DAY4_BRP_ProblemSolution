package com.Problems;

public class TrignoMetricFunctions {
    public static void main(String args[]) {
        double degrees = 30.0;
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        System.out.println("sin(" + degrees + ") = " + sinValue);
        System.out.println("cos(" + degrees + ") = " + cosValue);
    }
}
