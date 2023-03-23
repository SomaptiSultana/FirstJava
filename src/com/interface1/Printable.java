package com.interface1;

public interface Printable {
    int page = 5;
    String color = "Yellow";

    void PrintFlower();

    default void PrintBird(){
        PrintCow();
        System.out.println("Please print a sweet Bird");
    }

    public static String PrintName(String name){
        PrintPicture();
        return name;
    }

    private void PrintCow(){
        System.out.println("Print Cow");
    }

    private static void PrintPicture(){
        System.out.println("Print my Picture");
    }
}
