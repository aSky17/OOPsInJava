package com.Polymorphism;

public class Main {
//    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        Shapes circle = new Circle();
//        shape.area();
//        circle.area();
//
//    }
public static void main(String[] args)
{
//        superclass A = new superclass();
    Binding.subclass B = new Binding.subclass();
//        A.print();
    B.print();
    Binding.subclass.print(); // new subclass().print();
    //if we remove the print() method from subclass it will print superclass, this way it was hiding the superclass method
    Binding.superclass.print();
}
}
