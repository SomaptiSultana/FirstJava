package Class2;

public class Operators {
    public static void main(String[] args) {
        //Unary operator
        int weight=50;
        System.out.println("++expr" + ++weight);  //51
        System.out.println("expr++" + weight++);  //51=51+1=52
        System.out.println("expr" + weight);     //52

        System.out.println("--expr" + --weight);  //51
        System.out.println("expr--" + weight--);  //51=51-1=50
        System.out.println("expr" + weight);      //50

        //Arithmetic Operator
        int p =30, q =70;
        int r;
        r = p + q;
        System.out.println("number of fruits are" + r);  //100

        r = p -q;
        System.out.println("number of fruits are" + r);  //-40

        r = q * q;
        System.out.println("number of fruits are" + r);  //4900

        r = q / p;
        System.out.println("number of fruits are" + r);  //2

        r = q % p;
        System.out.println("number of fruits are" + r);  //10

        //Assignment Operator
        int mark1 = 40, mark2 = 80;
        mark2 +=20;
        System.out.println("mark2 : " + ++mark2);  //101

        mark1 -=10;
        System.out.println("mark1 : " + mark1);  //30

        mark1 *=5;
        System.out.println("mark1 : " + mark1++);  //150=150+1=151

        mark1 /=2;
        System.out.println("mark1 : " + --mark1);  //74

        mark2 %=3;
        System.out.println("mark2 : " + ++mark2);  //3

        //Relational Operator
        int age1 =50, age2 =110;

        System.out.println("age1 > age2 " + (age1 > age2));  //false
        System.out.println("age1 < age2 " + (age1 < age2));  //true
        System.out.println("age1 >= age2 " + (age1 >= age2));  //false
        System.out.println("age1 <= age2 " + (age1 <= age2));  //true
        System.out.println("age1 == age2 " + (age1 == age2));  //false
        System.out.println("age1 != age2 " + (age1 != age2));  //true

        //Logical Operator
        System.out.println((age1 > age2) || (age1 <= age2));  //true
        System.out.println((age1 > age2) && (age1 < age2));  //false

        //Ternary Operator
        //mark1 =74, mark2 =3;
        int minMark = (mark1 < mark2) ? mark1 : mark2;  //minMark=3
        System.out.println("minMark : " + minMark);

    }
}

