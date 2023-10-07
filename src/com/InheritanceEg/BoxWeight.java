package com.InheritanceEg;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super(1,3,5);
        this.weight = -1;
    }
    BoxWeight(BoxWeight old){
        super(old);
        this.weight = 7;
    }
    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h); //what is this? super() is used to call the constructor of parent class
        this.weight = weight;
    }


    public BoxWeight(BoxPrice other) {
//        super(other);  if we would have not used this, default constructor, i.e., of no arguments would have been called
        weight = other.weight;
    }
}
