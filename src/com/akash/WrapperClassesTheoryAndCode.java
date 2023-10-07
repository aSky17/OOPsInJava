package com.akash;/* In Java, everything can be viewed as object, either be it a simple file (with java.io file) or be it an
   image (with java.awt.Image file). Similarly, a primitive data type can also be converted into object using Wrapper
   classes. We needed it bcz many data structures are designed to operate on objects.
   Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types)
   and not primitive types.
   An object is needed to support synchronization in multithreading.

   1. Autoboxing
      The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double, etc.
 */


import java.util.ArrayList;

public class WrapperClassesTheoryAndCode {
    public static void main(String[] args)
    {
        char ch = 'a';

        // Autoboxing- primitive to Character object
        // conversion
        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);
        arrayList.add(26);
        arrayList.add(27);
        // printing the values from object
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

//        --------UNBOXING STARTS-----------
        Character ch1 = 'b';

        // unboxing - Character object to primitive
        // conversion
        char b = ch1;

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(24);

        // unboxing because get method returns an Integer object
        int num = arrayList1.get(0);

        // printing the values from primitive data types
        System.out.println(num);
    }
}
