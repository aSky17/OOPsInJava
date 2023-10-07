package com.InheritanceEg;

public class BoxPrice extends BoxWeight{
    double price;
    public BoxPrice() {
        super();
        this.price = -1;
    }
    BoxPrice(int price){
        super();
        this.price = price;
    }

    public BoxPrice(BoxPrice other, int price) {
        super(other);
        this.price = price;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;;
    }

    public BoxPrice(double l, double b, double h, double weight, int price) {
        super(l, b, h, weight);
        this.price = price;
    }


}
