package Class2;

public class PrimitiveDataType {
        int age;
        double weight;
        char name;
        final int height =53;

        public void printData(){
        System.out.println("age of the man is" + age);
        System.out.println("height of the man is" + height);
        System.out.println("name of the man is" + name);
        System.out.println("height is" + height);
    }

    public static void main(String[] args) {
        PrimitiveDataType man1 = new PrimitiveDataType();
        man1.age=35;
        man1.weight=65;
        man1.name='M';
        man1.printData();
    }
}
