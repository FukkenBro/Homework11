package com.lesson10;


public class Main {

    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[4];

        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setWeightGram(152);
        lemon.setPricePerKg(41.90);
        System.out.println("Lemon price: " + lemon.getPrice());
        System.out.println("Banana color: " + lemon.getColor());

        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 176, 27.00);
        System.out.println("Banana price: " + banana.getPrice());
        System.out.println("Banana color: " + banana.getColor());

        Fruit redApple = new Fruit(274, 14.90);
        redApple.setType(FruitType.APPLE);
        redApple.setColor(Color.RED);
        System.out.println("Red Apple price: " + redApple.getPrice());
        System.out.println("Red Apple color: " + redApple.getColor());

        Fruit greenApple = new Fruit(158, 16.9);
        greenApple.setType(FruitType.APPLE);
        greenApple.setColor(Color.GREEN);
        System.out.println("Green Apple price: " + greenApple.getPrice());
        System.out.println("Green Apple color: " + greenApple.getColor());

        fruits[0] = lemon;
        fruits[2] = greenApple;
        fruits[1] = banana;
        fruits[3] = redApple;

        double total = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == null) {
                continue;
            }
            total += fruits[i].getPrice();
        }
        System.out.println();
        System.out.println("Total: " + total);
    }
}

