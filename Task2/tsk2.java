import java.util.Scanner;
public class tsk2 {
   public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Enter the Mark of MATHEMATICS");
    double mark1=input.nextDouble();
    System.out.println("Enter the Mark of PHYSICS");
    double mark2=input.nextDouble();
    System.out.println("Enter the Mark of CHEMISTRY");
    double mark3=input.nextDouble();
    System.out.println("Enter the Mark of IT");
    double mark4=input.nextDouble();

    double sum=mark1+mark2+mark3+mark4;
    System.out.println("total mark = "+sum);

    double parcentage =(sum*100)/400;
    System.out.println("Average Parcenatage mark= "+parcentage);


    if (parcentage>=90) {
        System.out.println("O grade");
        
    }
    else if (parcentage>=80) {
        System.out.println("A Grade");
    }
    else if (parcentage>=70) {
        System.out.println("B1 Grade");
    }
    else if (parcentage>=60) {
        System.out.println("B2 Grade");
    }
    else if (parcentage<60) {
        System.out.println("C Grade");
    }
    else if (parcentage<30) {
        System.out.println("Fail");
    }
    




   }
}
