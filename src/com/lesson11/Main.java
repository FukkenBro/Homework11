package com.lesson11;

public class Main {

    public static void main(String[] args) {
        Person[] employees = new Person[100];
        for (int i = 0; i < 100; i++) {
            String gender = PersonGender.gender();
            String name = PersonName.name(gender);
            int age = PersonAgeAdult.age();
            double height = PersonHeightMeters.height();
            double weight = PersonWeightKg.weight(height);
            Person person = new Person(gender, name, age, height, weight);
            employees[i] = person;
            System.out.println(person);
        }
    }


}
