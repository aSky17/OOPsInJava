package com.Polymorphism;

public class Binding {
    public static class superclass {
         static void print()
        {
            System.out.println("print in superclass.");
        }
    }
    public static class subclass extends superclass {

        //print(); // the superclass method can no longer be called from the subclass, so its hidden
        //it is hidden from subclass not from main class
        static void print()
        {
            System.out.println("print in subclass.");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
        subclass.print(); // new subclass().print();
        //superclass ka print() method is hidden from subclass not from main class
    }
}
