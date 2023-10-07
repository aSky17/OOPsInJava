package com.InheritanceEg;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(2);
//        Box box1 = new Box(box);
//        System.out.println(box1.l+" "+box1.b+" "+box1.h);
//        BoxWeight box2 = new BoxWeight();
//        System.out.println(box2.h+" "+box2.weight);
//
//        BoxWeight box3 = new BoxWeight(1,45,63,6);
//        System.out.println();

//        Box box = new BoxWeight(1,2,4,6); //same as--->   Box box = new Box(); just that the constructor of BoxWeight                                                              will be called because we are creating object for that only
//        System.out.println(box.b);
//        System.out.println(box.weight); //theory in notes






//          BoxWeight box = new Box(1,3,5);
          //there are many variables in the parent and child classes
          // you are given the access to variables that are in reference type i.e., BoxWeight, so we can access weight variable
          //this also means that the ones you are trying to access should also be initialized, but if you do not aren't creating the object means you are not either calling the constructor of child class, i.e., they were never initialized
        // but here when the object itself is of type parent class how will u call the constructor of child class
        // parent class have no idea of child class ke members and functions




        BoxPrice box = new BoxPrice(new BoxPrice());
        System.out.println(box.l+" : "+box.b+" : "+box.h+" : "+box.weight+" : "+box.price);

    }



}
