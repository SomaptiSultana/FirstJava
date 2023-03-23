package com.practice.abstraction.abstract1;

public abstract class Shape {

    public int size;
    public String color;

    abstract String getShape();

    public void printShape(){
        System.out.println("Shapes are good");
    }

    public void printInfo(){
        System.out.println("size is " + size);
        System.out.println("color is " + color);
    }
}
