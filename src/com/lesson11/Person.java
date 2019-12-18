package com.lesson11;

public class Person {

    private String gender;
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String gender, String name, int age, double height, double weight) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "   " +
                gender +
                " " + age + " лет,   " +
                " вес " + weight + " кг,   " +
                " рост " + height + " м";
    }

}