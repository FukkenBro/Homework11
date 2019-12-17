package com.lesson11;

import java.util.Random;

public class PersonName {

    public static String name(String gender) {
        return nameGenerator(gender);
    }

    private static Random RANDOM = new Random();

    private static String nameGenerator(String gender) {

        String[] namesMaleArrayOne = {"Серг", "Андр", "Пав", "Дан", "Ден", "Ир", "Валер", "Кар", "Пив", "Рост"};
        String[] namesMaleArrayTwo = {"ей", "ел", "ил", "ис", "аклий", "ий", "асик", "анатор", "ас", "ислав", "аслав"};
        String[] namesFemaleArrayOne = {"Ольг", "Анастас", "Мар", "Виктор", "Гал", "Екатер", "Соф"};
        String[] namesFemaleArrayTwo = {"а", "ия", "ина", "ына", "ыла", "элла", "аслава", "ислава"};

        String name = "";
        StringBuilder sb = new StringBuilder(name);

        if (gender.equals("Male")) {
            sb.append(namesMaleArrayOne[RANDOM.nextInt(namesMaleArrayOne.length)]);
            sb.append(namesMaleArrayTwo[RANDOM.nextInt(namesMaleArrayTwo.length)]);
            return sb.toString();
        }
        if (gender.equals("Female")) {
            sb.append(namesFemaleArrayOne[RANDOM.nextInt(namesFemaleArrayOne.length)]);
            sb.append(namesFemaleArrayTwo[RANDOM.nextInt(namesFemaleArrayTwo.length)]);
            return sb.toString();
        }
        if (gender.equals("Other")) {
            int tmp = RANDOM.nextInt(2);
            if (tmp == 1) {
                return nameGenerator("Male");
            }
            if (tmp == 0) {
                return nameGenerator("Female");
            } else return "otherGenderError";
        } else return "nameError";
    }

}
