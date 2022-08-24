package com.company;

public class Horse extends Animal{
    private String breed;
    private String Runsfast;


    public String getBreed() {
        return breed;
    }



    public String getRunsfast() {
        return runsfast;
    }


    private String runsfast;
    public Horse(String food, String location,String breed,String runsfast) {
        super(food, location);
        this.breed = breed;
        this.runsfast = runsfast;
    }

    @Override
    public void makeNoice() {
        System.out.println("Такое-то животные спит");

    }

    @Override
    public void eat() {
        System.out.println("grass");

    }


    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", runsfast='" + runsfast + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("sdfsr");


    }
}
