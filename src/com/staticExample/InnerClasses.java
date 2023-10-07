package com.staticExample;

import java.util.Arrays;

public class InnerClasses {
    private static void check(){
        System.out.println("I'm in a private method of outer class");
    }
    static class Test{
        String name;
        public Test(String name){
            this.name = name;

        }
        static{
            check();
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Akash");
        Test b = new Test("Prakash");
        System.out.println(a.name);
        System.out.println(b.name);


    }
}


