package se.lexicon;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args)
    {
        int max = 500;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean correct = false;
       int answer = rand.nextInt(max) + 1;
        while (!correct) {

            System.out.println(
                    "Guess a number between 1 and 500: ");
             int guess = in.nextInt();
            if (guess > answer) {
                System.out.println("Your guess was too big");
            }
            else if (guess < answer) {
                System.out.println("Your guess was too small");
            }
            else {

                System.out.println(
                        "Yes, Your guess was correct.");

                correct = true;
            }
        }

    }
}


