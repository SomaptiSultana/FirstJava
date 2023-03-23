package Class3;

public class DicisionMakingStatement {

    public static void main(String[] args) {
        int i = 20;

        //Simple if statement
        if (i < 15) {
            System.out.println("10 is less than 15");
        }

        //if-else statement
        if (i <= 15) {
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greater than 15");  //print this part
        }
        //if-else-if ladder
        if (i == 15) {
            System.out.println("i is 15");
        } else if (i == 35) {
            System.out.println("i is 35");
        } else if (i == 20) {
            System.out.println("i is 20");
        } else {
            System.out.println("i is not present");
        }
        //Nested if-statement
        if (i == 20 || i < 25)
            if (i < 25) {
                System.out.println("i is less than 25");
            }
        if (i < 30) {
            System.out.println("i is less than 30");
        } else {
            System.out.println("i is greater than 30");
        }
    }
}

