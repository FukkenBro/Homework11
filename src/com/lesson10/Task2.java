package com.lesson10;


//        2*)Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y.Определить пройдет ли кирпич в отверстие.
//        Например кирпич со сторонами 2,3,2не пройдет в отверстие 1x50.


import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        driver();
    }

    private static final Random RANDOM = new Random();

    private static void driver() {
        System.out.println("Нажмите Enter чтобы продолжить ...");
        try {
            System.in.read();

            int[] brick = brickGenerator();
            System.out.println("Кирпич - " + Arrays.toString(brick));
            int[] hole = holeGenerator();
            System.out.println("Отверстие - " + Arrays.toString(hole));
            checkIfFits(brick, hole);
            System.out.println();
            driver();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    private static int[] brickGenerator() {
        int[] brick = new int[3];
        for (int i = 0; i < 3; i++) {
            brick[i] = RANDOM.nextInt(100) + 1;
        }
        return brick;
    }

    private static int[] holeGenerator() {
        int[] hole = new int[2];
        for (int i = 0; i < 2; i++) {
            hole[i] = RANDOM.nextInt(100) + 1;
        }
        return hole;
    }


    private static void checkIfFits(int[] brick, int[] hole) {

        Arrays.sort(brick);
        Arrays.sort(hole);
        int eventCounter = 0;

        // Smaller rectangle with sides q and p (p >= q)
        // Larger rectangle with sides b and a (a >= b)

        if (brick[0] <= hole[0] && (brick[1] <= hole[1] || hole[0] * (brick[1] * brick[1] + brick[0] * brick[0]) >= (2 * brick[1] * brick[0] * hole[1] + (brick[1] * brick[1] - brick[0] * brick[0]) * Math.sqrt(brick[1] * brick[1] + brick[0] * brick[0] - hole[1] * hole[1])))) {
            System.out.println("Проходит стороной " + brick[0] + ":" + brick[1]);
            eventCounter++;
        }
        if (brick[0] <= hole[0] && (brick[2] <= hole[1] || hole[0] * (brick[2] * brick[2] + brick[0] * brick[0]) >= (2 * brick[2] * brick[0] * hole[1] + (brick[2] * brick[2] - brick[0] * brick[0]) * Math.sqrt(brick[2] * brick[2] + brick[0] * brick[0] - hole[1] * hole[1])))) {
            System.out.println("Проходит стороной " + brick[0] + ":" + brick[2]);
            eventCounter++;
        }
        if (brick[1] <= hole[0] && (brick[2] <= hole[1] || hole[0] * (brick[2] * brick[2] + brick[1] * brick[1]) >= (2 * brick[2] * brick[1] * hole[1] + (brick[2] * brick[2] - brick[1] * brick[1]) * Math.sqrt(brick[2] * brick[2] + brick[1] * brick[1] - hole[1] * hole[1])))) {
            System.out.println("Проходит стороной " + brick[1] + ":" + brick[2]);
            eventCounter++;
        }
        if (eventCounter == 0) {
            System.out.println("Не проходит");
        }
    }
}


