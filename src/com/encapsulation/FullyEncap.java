package com.encapsulation;

public class FullyEncap {

    //For Fully Encapsulation

    public static void main(String[] args) {
        Student student1 =new Student();
        student1.setRoll(10);
        student1.setName("Faria");
        student1.setGender("Female");
        System.out.println(student1.getRoll());
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
    }
}
