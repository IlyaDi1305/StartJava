package com.startjava.Lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("man");
        wolfOne.setName("Adam");
        wolfOne.setWeight(45);
        wolfOne.setAge(9);
        wolfOne.setColor("grey");
        System.out.println("gender = " + wolfOne.getGender());
        System.out.println("name = " + wolfOne.getName());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("color = " + wolfOne.getColor());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}