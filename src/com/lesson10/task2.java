package com.lesson10;


//        2*)Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y.Определить пройдет ли кирпич в отверстие.
//        Например кирпич со сторонами 2,3,2не пройдет в отверстие 1x50.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        driver();
    }

    private static final Random RANDOM = new Random();

    private static void driver() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите Enter чтобы продолжить ...");
        try {
            System.in.read();

            int[] brick = brickGenerator();
            System.out.println("Кирпич - " + Arrays.toString(brick));
            int[] otverstie = otverstieGenerator();
            System.out.println("Отверстие - " + Arrays.toString(otverstie));
            checkIfFits(brick, otverstie);
            System.out.println();
            driver();
        } catch (Exception e) {

        }
    }

    private static int[] brickGenerator() {
        int[] brick = new int[3];
        for (int i = 0; i < 3; i++) {
            brick[i] = RANDOM.nextInt(100)+1;
        }
        return brick;
    }

    private static int[] otverstieGenerator() {
        int[] otverstie = new int[2];
        for (int i = 0; i < 2; i++) {
            otverstie[i] = RANDOM.nextInt(100)+1;
        }
        return otverstie;
    }


    private static void checkIfFits(int[] brick, int[] otverstie) {

        Arrays.sort(brick);
        Arrays.sort(otverstie);
        int костыль = 0;

        if (brick[0] <= otverstie[0] && (brick[1] <= otverstie[1] || otverstie[0] * (brick[1] * brick[1] + brick[0] * brick[0]) >= (2 * brick[1] * brick[0] * otverstie[1] + (brick[1] * brick[1] - brick[0] * brick[0]) * Math.sqrt(brick[1] * brick[1] + brick[0] * brick[0] - otverstie[1] * otverstie[1])))) {
            System.out.println("Проходит стороной " + brick[0] + ":" + brick[1]);
            костыль++;
        }
        if (brick[0] <= otverstie[0] && (brick[2] <= otverstie[1] || otverstie[0] * (brick[2] * brick[2] + brick[0] * brick[0]) >= (2 * brick[2] * brick[0] * otverstie[1] + (brick[2] * brick[2] - brick[0] * brick[0]) * Math.sqrt(brick[2] * brick[2] + brick[0] * brick[0] - otverstie[1] * otverstie[1])))) {
            System.out.println("Проходит стороной " + brick[0] + ":" + brick[2]);
            костыль++;
        }
        if (brick[1] <= otverstie[0] && (brick[2] <= otverstie[1] || otverstie[0] * (brick[2] * brick[2] + brick[1] * brick[1]) >= (2 * brick[2] * brick[1] * otverstie[1] + (brick[2] * brick[2] - brick[1] * brick[1]) * Math.sqrt(brick[2] * brick[2] + brick[1] * brick[1] - otverstie[1] * otverstie[1])))) {
            System.out.println("Проходит стороной " + brick[1] + ":" + brick[2]);
            костыль++;
        }
        if (костыль == 0) {
            System.out.println("Не проходит");
        }
    }
}


