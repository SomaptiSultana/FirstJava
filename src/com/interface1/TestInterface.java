package com.interface1;

public class TestInterface {
    public static void main(String[] args) {
        Flower flower =new Flower();
        System.out.println(Printable.page);
        System.out.println(Printable.color);
        flower.PrintFlower();
        flower.PrintBird();
        System.out.println(Printable.PrintName("Somapti"));
    }
}
