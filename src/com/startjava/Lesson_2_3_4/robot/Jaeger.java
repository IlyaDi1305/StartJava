package com.startjava.Lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String bodyLanguage;
    private float height;
    private float weight;
    private String weapon;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String bodyLanguage, float height, float weight, 
                String weapon) {
        this.modelName = modelName;
        this.mark = mark;
        this.bodyLanguage = bodyLanguage;
        this.height = height;
        this.weight = weight;
        this.weapon = weapon;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBodyLanguage() {
        return bodyLanguage;
    }

    public void setBodyLanguage(String bodyLanguage) {
        this.bodyLanguage = bodyLanguage;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean drift(){
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useWeapon() {
        System.out.println("activated weapon: " + weapon);
    }
}