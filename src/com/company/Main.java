package com.company;
import Colorable.Colorable;
public class Main {

    public static void main(String[] args) {
        Shape[] shapes=new Shape[5];
        shapes[0]=new Circle(1.0,"red",false);
        shapes[1]=new Square();
        shapes[2]=new Circle(4.0,"red",false);
        shapes[3]=new Square(2.0,"yellow",true);
        shapes[4]=new Square(4);


        System.out.println("pre-resized");
        for (Shape shape: shapes){
            System.out.println(shape);
            if (shape instanceof Square){
                shape.howToColor();
            }
        }

    }
}
