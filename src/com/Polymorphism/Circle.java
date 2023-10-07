package com.Polymorphism;

public class Circle extends Shapes{
    @Override // this is annotation and is used to check if the method overrides another method or not
    void area(){
        System.out.println("Area is pie*r*r");
    }
}
