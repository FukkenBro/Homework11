package com.lesson11;

import java.util.Random;

public class PersonAgeAdult {

    public static int age() {
        return ageAdultGenerator();
    }

    private static Random RANDOM = new Random();

    private static int ageAdultGenerator() {
        int age = RANDOM.nextInt(70 - 18) + 18;
        return age;
    }
}
