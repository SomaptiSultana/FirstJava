package com.encapsulation;

public class Student {
    //Fully Encapsulation

    private int roll;
    private String name;
    private String gender;

    //Using Constructor

    //public Student(int roll, String name, String gender) {
      //  this.roll = roll;
    //    this.name = name;
     //   this.gender = gender;
    //}

    //getter Method
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    //setter Method

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
