package com.InheritanceEg;

import com.access.A;
import com.akash.B;

class C extends A {
    public static void main(String[] args) {
        C obj = new C();
        int c = obj.a;
        B obj1 = new B();
        System.out.println(obj1.x);

    }
}
