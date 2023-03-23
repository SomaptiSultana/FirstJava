package com.practice.generic.generics;

public class TestGeneric {
    public static void main(String[] args) {
        Generic1 <String> generic1 =new Generic1 <>("Black");
        System.out.println(generic1.getValue());

        Generic1 <Integer> generic2 =new Generic1<>(45);
        System.out.println(generic2.getValue());

        Generic1 <Double> generic3 =new Generic1<>(56.546245);
        System.out.println(generic3.getValue());
    }
}
