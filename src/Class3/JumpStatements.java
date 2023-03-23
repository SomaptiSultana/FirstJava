package Class3;

public class JumpStatements {
    public static void main(String[] args) {
        for (int j = 0; j < 15; j++){
            if (j == 10){
                break;
            }
            System.out.println("the number of j is " + j);
        }

        System.out.println("***********************");

        int j = 0;
        while (j < 15){
            if (j == 9){
                j++;
                continue;
            }
            System.out.println("the number of j is " + j);
            j++;
        }
    }

}
