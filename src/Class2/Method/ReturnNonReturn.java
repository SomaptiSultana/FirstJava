package Class2.Method;

public class ReturnNonReturn {
    private String subject;
    private String name;
    private int mark;

    public ReturnNonReturn(String subject, String name, int mark){
        this.subject=subject;
        this.name=name;
        this.mark=mark;
    }
    //nonReturn
    public void PrintData2(){
        System.out.println(subject + " " + name + " " + mark);
    }

    public String getSubject(){
        return subject;
    }
    public int getMark(){
        return mark;
    }

    public static void main(String[] args) {
        ReturnNonReturn method1 =new ReturnNonReturn("Bangla", "Somapti", 80);
        method1.PrintData2();

        System.out.println("Subject " + method1.getSubject());
        System.out.println("Mark " + method1.getMark());
    }
}
