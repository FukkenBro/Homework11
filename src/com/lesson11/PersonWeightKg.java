package com.lesson11;

public class PersonWeightKg {
    public static double weight(double heightMeters) {
        return Math.round((0.634 * heightMeters * 100 - 52.849) * 100) / 100;
    }
}
