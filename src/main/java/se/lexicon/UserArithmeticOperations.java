package se.lexicon;
import java.util.Scanner;

public class UserArithmeticOperations {


    public static void main(String[]args) {

        int num1, num2 ;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a num1 and num2");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println("Addition of two numbers " + (num1 + num2));
        System.out.println("Subtraction of two numbers = " + (num1 - num2));
        System.out.println("Multiplication of two numbers= " + (num1 * num2));
        System.out.println("Division of two numbers = " + (num1 / num2));
    }
}
