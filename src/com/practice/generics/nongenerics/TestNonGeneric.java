package com.practice.generics.nongenerics;

public class TestNonGeneric {
    public static void main(String[] args) {

        IntegerPractice integer1 = new IntegerPractice(50, 15);
        System.out.println(integer1.getAge());
        System.out.println(integer1.getRoll());

        DoublePractice double1 =new DoublePractice(56.8456);
        System.out.println(double1.getWeight());

        StringPractice string1 =new StringPractice("Pink", "Bird");
        System.out.println(string1.getColor());
        System.out.println(string1.getName());

        LongPractice long1 =new LongPractice(454527472);
        System.out.println(long1.getNumber());
    }
}
