package com.akash;

public class passByValueAndReference {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        swap(a,b); // this is pass by value and if you want to see pass by reference, remember the swapping in arrays
        System.out.println(a+" "+b);
        //In Java, you cannot directly pass variables by reference like you can in some other programming languages. However, you can achieve a similar effect by passing objects and modifying their internal state
    }
    static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
