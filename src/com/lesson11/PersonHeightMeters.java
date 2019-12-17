package com.lesson11;

import java.util.Random;

public class PersonHeightMeters {
    public static double height() {
        return heightMetersGenerator();
    }

    private static Random RANDOM = new Random();

    private static double heightMetersGenerator() {
        double heightMeters = RANDOM.nextInt(250 - 130) + 130;
        return Math.round(heightMeters * 100.0) / 10000.0;
    }

}
