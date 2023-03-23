package inheritance;

public class SingleInheritance extends Vehicle{
    public static void main(String[] args) {
        SingleInheritance Inheritance = new SingleInheritance();
        System.out.println(Inheritance.Brand);
        Inheritance.horn();
        Inheritance.drive();
    }
}
