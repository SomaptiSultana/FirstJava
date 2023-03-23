package com.encapsulation;

public class Women {

    //Write Encapsulation

    private String name;
    private int age;
    private int weight;

    //setter Method


    public void setName(String name) {
        this.name = name;
        System.out.println("name is " + name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("age is " + age);
    }

    public void setWeight(int weight) {
        this.weight = weight;
        System.out.println("weight is " + weight);
    }
}
