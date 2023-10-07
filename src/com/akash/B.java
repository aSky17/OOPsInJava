package com.akash;

//this class is to test the protected keyword working in subclass of different pkg

import com.access.A;

public class B extends A{
     public int x = 3; //declare it protected and you'll know that B does not have any connection with C IN TERMS OF INHERITANCE.
    public static void main(String[] args) {;
        B obj = new B();
        int c = obj.a;

    }
}

