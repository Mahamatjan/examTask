package com.company;

public class Dog extends Animal{
    private int ves;
    private int age;
    private String color;


    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String food, String location, int ves, int age, String color) {
        super(food, location);
        this.ves = ves;
        this.age = age;
        this.color = color;


    }

    @Override
    public void makeNoice() {
        System.out.println("Такое-то животные спит");

    }

    @Override
    public void eat() {
        System.out.println("meat");

    }

    @Override
    public String toString() {
        return "Dog" +
                "ves='" + ves + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("ldmfs");



    }
}
