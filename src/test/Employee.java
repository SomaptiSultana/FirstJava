package test;

public class Employee {

    //Naming convention
    //Variable
    public int weight, age;
    public String name;
    public static final String COUNTRY_NAME = "Bangladesh";

    //no-arg constructor
    public Employee() {
        System.out.println("employee's hair color is black");
    }


    //Using Parameterized Constructor
    public Employee(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public void PrintInfo() {
        System.out.println("Employee name is " + name);
        System.out.println("Employee weight is " + weight);
        System.out.println("Employee age is " + age);
        System.out.println("Employee country_name is " + COUNTRY_NAME);
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.weight = 60;
        employee1.age = 45;
        employee1.name = "Habib";

        Employee employee2 = new Employee();
        employee2.name = "Mukta";
        employee2.age = 35;
        employee2.weight= 80;

        employee1.PrintInfo();
        employee2.PrintInfo();

        Employee employee3 =new Employee(30, 10, "Sadik");
        employee3.PrintInfo();

    }
}

