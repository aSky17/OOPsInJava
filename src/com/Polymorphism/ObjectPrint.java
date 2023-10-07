package com.Polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num;
    }
    //uptill now java was implementing its own toString() method as every class extends Object class and this function toString() is in Object class
    // but now what i wanna do is override that internal method by creating my own toString() method
    @Override
    //at run-time it will determine that it has to run this toString method not the in-built one, that's how dynamic method dispatch---- dynamic polymorphism via overriding
    public String toString() {
        return this.getClass().getName() + "@" + "akashAcchaHai";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(45);
        System.out.println(obj);// ive not told java whenever u print this object, u have to print that number, i have'nt told this to java, so java will do something internally on its own
        System.out.println(obj.num);
    }
}
