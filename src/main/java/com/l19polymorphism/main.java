package com.l19polymorphism;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Shape s1 = new Shape();
        shapes.add(s1);

        Shape s2 = new Circle();
        shapes.add(s2);

        Shape s3 = new Square();
        shapes.add(s3);

        Shape s4 = new Triangle();
        shapes.add(s4);

        for (Shape item : shapes) {
            item.draw();
        }

    }
}
