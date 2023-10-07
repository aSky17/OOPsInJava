package com.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
//    isMarried = true;  You can't initialize a variable after declaring it at class level, it can be done at method level
    static long population; // some properties may be object independent, i.e. are common to all objects
    static{
        population = 2; // XD, by default person ADAM & EVE
    } // static block will run only once when the first object is created


    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;

         //we should not use this.xyz because it will then become object specific, that's why we refer to access it using class name
         //though it will work in that way too

    }
       public static void greetings(){
        System.out.println("Jai shree ram!");
    }


}
