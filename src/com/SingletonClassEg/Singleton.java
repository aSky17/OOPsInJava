package com.SingletonClassEg;

public class Singleton {
    private Singleton(){
        System.out.println("I'm in Singleton constructor");
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        //check whether 1 obj is created or not
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
