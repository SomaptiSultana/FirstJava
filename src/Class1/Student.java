package Class1;

public class Student {
    String name, gender;
    int roll, mobile;
    static String address;            //static variable
    final String school_name = "XYZ";


    public void Printinfo() {
        System.out.println("student name is =" + name);
        System.out.println("sudendt's gender is =" + gender);
        System.out.println("student's roll is =" + roll);
        System.out.println("student's mobile number is =" + mobile);
        Student.address = "dhaka";
        System.out.println("address is =" + address);
        System.out.println("school name is =" + name);

    }

    public Student() {                    //Constractor
       System.out.println("Faria is a student of class 5");
    }

    public void printDOB() {                     //local variable
        String dob = "01-01-2023";
        System.out.println("Student dob is =" + dob);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "P";
        student1.gender = "G";
        student1.roll = 123;
        student1.mobile = 0161247664;
        Student.address = "Rajshahi";
        System.out.println("address is =" + address);
        student1.printDOB();
        student1.Printinfo();
    }
}




