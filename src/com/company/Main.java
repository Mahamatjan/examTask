package com.company;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("ab","batken",25,4,"black");
        Cat cat = new Cat("av","osh","Бурмилла");
        Horse horse = new Horse("sadfj","Talac","Ак шумкар","80км/час");
        Animal[] animals = {dog,cat,horse};
        for (Animal i :animals) {
            System.out.println(i);
            i.makeNoice();
            i.eat();
            System.out.println("              ");

        }




    }
}