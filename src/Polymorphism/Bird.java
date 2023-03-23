package Polymorphism;

public class Bird {
    public String name = "Parrot";


//Overloading
    public void sound(){
        System.out.println("Parrot sound is amazing");
    }

    public void sing(){
        System.out.println("Parrot sing very well");
    }

    public static void main(String[] args) {
        Bird bird1 =new Bird();
        bird1.sound();
    }





}
