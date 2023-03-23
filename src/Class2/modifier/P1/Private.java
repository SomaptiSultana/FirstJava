package Class2.modifier.P1;

public class Private {
    private int roll;
    public String name, subject;

    private void PrintInfo(){
        System.out.println("roll number is " + roll);
    }
    public void PrintInfo2(){
        System.out.println("name is " + name);
        System.out.println("subject is " + subject);
    }

    public static void main(String[] args) {
        Private private1 =new Private();
        private1.roll=15;
        private1.name="Somapti";
        private1.subject="Math";
        private1.PrintInfo();
        private1.PrintInfo2();
    }
}
