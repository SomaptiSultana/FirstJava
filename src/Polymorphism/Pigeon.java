package Polymorphism;

public class Pigeon extends Bird{
    //override

    @Override
    public void sound(){
        System.out.println("Pigeon sound is amazing");
    }
    public static void main(String[] args) {
        Pigeon override =new Pigeon();
        System.out.println(override.name);
        override.sound();
        override.sing();
    }
}
