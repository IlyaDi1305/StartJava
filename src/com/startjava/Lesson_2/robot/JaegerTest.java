package com.startjava.Lesson_2.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setBodyLanguage("Mobile Artillery");
        jaegerOne.setHeight(70.91f);
        jaegerOne.setWeight(2.128f);
        jaegerOne.setWeapon("Vortex Cannon");
        System.out.println("ModelName: " + jaegerOne.getModelName());
        System.out.println("Height: " + jaegerOne.getHeight());
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useWeapon();
        System.out.println();
        
        Jaeger jaegerTwo = new Jaeger("Guardian Bravo", "Mark-6", "Counter Striker", 73.21f, 1.975f, 
                "Arm Mounted Guns");
        System.out.println("ModelName: " + jaegerTwo.getModelName());
        System.out.println("Height: " + jaegerTwo.getHeight());
        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useWeapon();

    }
}