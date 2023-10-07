package com.staticExample;

// Java Program to Demonstrate Nested class

// Class 1
// Helper classes
class Outer {

    // Class 2
    // Simple nested inner class
    class Inner {

        // show() method of inner class
        public static void show()
        {

            // Print statement
            System.out.println("In a nested class method");
        }
    }
}

// Clin.ass 2
// Main class
public class NestedInnerClass {

    // Main driver method
    public static void main(String[] args)
    {

        // Note how inner class object is created inside
        // main()
//        Outer.Inner in = new Outer().new Inner();

        // Calling show() method over above object created
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

