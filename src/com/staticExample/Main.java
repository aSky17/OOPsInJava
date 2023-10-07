package com.staticExample;

import static com.staticExample.Human.greetings;

public class Main {
    public static void main(String[] args) {
//        Human akash = new Human(18,"Akash",10000,false);
//        Human prakash = new Human(22,"Prakash",15000,true);
//        Human anshu = new Human(19,"Anshu",25000,false);
//        System.out.println(Human.population); // same thing here, access it via class name, XD now its giving me Object oriented programming language really
//        //static variables are not dependent on the object, if no object is created even then the static variables can be accessed.
        //bcz object in instantiated at runtime and static stuffs are resolved during compile time
        greetings();
    }
}
