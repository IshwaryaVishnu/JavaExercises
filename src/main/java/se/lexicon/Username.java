package se.lexicon;
import java.util.Scanner;

public class Username {
    public static void main(String[]args){
        String userName;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        userName = in.nextLine();
        System.out.println("Hello "+ userName);

    }
}
