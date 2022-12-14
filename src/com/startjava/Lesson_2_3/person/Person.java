package com.startjava.Lesson_2_3.person;

public class Person {

    String gender = "man";
    String name = "Alex";
    int height = 184;
    int weight = 76;
    int age = 27;

    void walk() {
        System.out.println("walking");
    }

    boolean sit() {
        return true;
    }

    void run() {
        System.out.println("running");
    }

    String talk() {
        return "bla-bla-bla";
    }

    void learnJava() {
        System.out.println("learning Java");
    }
}