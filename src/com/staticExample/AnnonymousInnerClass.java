package com.staticExample;

class A{
    void show()
    {
        System.out.println("In A show");
    }
}
//class B extends A{
//    void show()
//    {
//        System.out.println("In B show");
//    }
//}
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
           void show(){
               System.out.println("in new show");
           }
        };
        obj.show();
    }

}
