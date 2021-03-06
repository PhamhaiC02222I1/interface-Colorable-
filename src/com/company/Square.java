package com.company;

import Colorable.Colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(){}
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side*Math.PI;
    }

    @Override
    public String toString() {
        return "Square has:" +
                " side=" + side+" ,Area is: "+getArea()+" "+super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
