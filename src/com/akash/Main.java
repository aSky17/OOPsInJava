package com.akash;

public class Main {
    public static void main(String[] args) {
//        com.akash.Student kunal = new com.akash.Student();
//        kunal.rollNo = 01;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 17.0f;
//        System.out.println(kunal.rollNo);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//
//        com.akash.Student akash = new com.akash.Student();
//        akash.rollNo = 12;
//        akash.marks = 98.0f;
//        System.out.println(akash.rollNo);
//        System.out.println(akash.name);
//        System.out.println(akash.marks);

        // you see this is becoming cumbersome
        //btw cumbersome means heavy to carry or lift

//        com.akash.Student akash = new com.akash.Student(01,"Akash",98);
//        com.akash.Student alex = new com.akash.Student(02,"Alex",100);
//        System.out.println(akash.rollNo);
//        System.out.println(akash.name);
//        System.out.println(akash.marks);
//        System.out.println(alex.rollNo);
//        System.out.println(alex.name);
//        System.out.println(alex.marks);

        Student random = new Student();
          System.out.println(random.rollNo);
          System.out.println(random.name);
          System.out.println(random.marks);


    }
}
class Student{
    int rollNo;
    String name;
    float marks;

//    com.akash.Student(com.akash.Student other){
//        this.rollNo = other.rollNo;
//        this.name = other.name;
//        this.marks = other.marks;
//    }


//    com.akash.Student akash = new com.akash.Student(01,"Akash",98);
//    com.akash.Student alex = new com.akash.Student(02,"Alex",100);
    // here, 'this' will be replaced by akash or alex
    Student(int rollNo,String name,float marks){
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name;
    }
    Student(){
        //calling a constructor from another constructor
        //internally its like new com.akash.Student(13,"Akash",98);
        this (13,"Akash",98);
    }
}