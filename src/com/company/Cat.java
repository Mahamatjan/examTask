package com.company;

public class Cat extends Animal{
    private String breed;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
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
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("dsfs");

    }
}
