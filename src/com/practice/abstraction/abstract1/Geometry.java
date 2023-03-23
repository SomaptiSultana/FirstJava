package com.practice.abstraction.abstract1;

public abstract class Geometry {
    public String shape;
    public String color;
    public int line;

    public Geometry(){
        System.out.println("Geometry is very Boring Subject");
    }

    public Geometry(String shape, String color, int line) {
        this.shape = shape;
        this.color = color;
        this.line = line;
    }

    public void printData(){
        System.out.println("Shape is " + shape + " color is " + color + " Line is " + line);
    }
}
