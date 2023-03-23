package com.practice.abstraction.abstract1;

public class TestAbstraction {
    public static void main(String[] args) {
        Rectangle shape1 =new Rectangle();
        shape1.size= 3;
        shape1.color ="Pink";
        shape1.printInfo();
        System.out.println(shape1.getShape());
        shape1.printShape();
        Circle shape2 =new Circle();
        System.out.println(shape2.getShape());

        Shape shape3 =new Rectangle();
        System.out.println(shape3.getShape());

        Shape shape4 =new Circle();
        System.out.println(shape4.getShape());
    }
}
