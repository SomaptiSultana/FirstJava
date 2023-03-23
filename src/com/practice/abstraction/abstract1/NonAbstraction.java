package com.practice.abstraction.abstract1;

public class NonAbstraction extends Geometry{

    public NonAbstraction(String shape, String color, int line) {
        super(shape, color, line);
    }

    public static void main(String[] args) {
        NonAbstraction geometry =new NonAbstraction("Square", "Red", 4);
        geometry.printData();

        Geometry geometry1 = new Geometry() {
            @Override
            public void printData() {
                super.printData();
            }
        };
    }

    }



