package inheritance;

public class Company extends Car{

    //Multilevel
    public static void main(String[] args) {
        Company myCar = new Company();
        System.out.println(myCar.name);
        System.out.println(myCar.wheel);
        System.out.println(myCar.Brand);
        myCar.Racing();
        myCar.horn();
        myCar.drive();
    }
}
