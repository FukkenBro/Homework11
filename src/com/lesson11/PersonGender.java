package com.lesson11;

import java.util.Random;

public class PersonGender {

    public static String gender() {
        return genderGenerator();
    }

    private static Random RANDOM = new Random();

    private static String genderGenerator() {
        int i = RANDOM.nextInt(11);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return "Male";
        }
        if (i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
            return "Female";
        } else {
            return "Other";
        }
    }

}
