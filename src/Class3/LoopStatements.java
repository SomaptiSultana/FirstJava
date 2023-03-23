package Class3;

public class LoopStatements {
    public static void main(String[] args) {
        //for loop
        //Increment
        for (int step = 0; step < 5; step++) {
            System.out.println("Walking west one step " + step);
        }
        //Decrement
        for (int step = 6; step > 0; step--) {
            System.out.println("Walking west one step " + step);
        }
        //for-each
        int roll [] = {10, 20, 30};
        for (int serial : roll){
            System.out.println(serial);
        }

        System.out.println("************************");

        String name [] = {"name1", "name2", "name3"};
        for (String item : name){
            System.out.println(item);
        }

        //while loop
        int step = 2;
        while (step < 5) {
            System.out.println("Walking west one step " + step);
            step++;
        }
        //do-while
        int i = 9;
        do {
            System.out.println("the value of i is " + i);
            i++;
        } while (i < 10);
    }
}

