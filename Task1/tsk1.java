import java.util.Random;
import java.util.Scanner;

public class tsk1 {
    public static void main(String[] args) {
        Random num = new Random();
        int randomint = num.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number: ");

        int num1;
    
        for (int i = 1; i <= 5; i++) {
            num1 = input.nextInt();

            if (num1 > randomint) {
                System.out.println("guess a smaller number");
            } else if (num1 < randomint) {
                System.out.println("guess a greater number");
            } 
            else if (num1==randomint) {
                System.out.println("successfully matched " + randomint);
                break;
            }
            if (i<5) {
                System.out.println((5-i)+"attempts left");
            }
            else {
                System.out.println("No attempts left! The correct number was " + randomint);
            }
            

        }

    }

}
