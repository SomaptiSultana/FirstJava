package Class2.modifier.P1;

public class Protected {
    protected int age;
    public String subject;
    final String name ="Somapti";
    protected void PrintInfo(){
        System.out.println("age is " + age);
    }
    public void PrintInfo2(){
        System.out.println("subject is " +subject);
    }

    public static void main(String[] args) {
        Protected protected1=new Protected();
        protected1.age=45;
        protected1.subject="English";
        protected1.PrintInfo();
        protected1.PrintInfo2();
    }
}
