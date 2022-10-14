package se.lexicon;

import java.util.Scanner;

public class SecondsConversion {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the Input Seconds: ");
        int seconds = in.nextInt();
        int seconds1 = seconds % 60;
        int seconds2 = seconds / 60;
        int seconds3 = seconds2 % 60;
        seconds2 = seconds2 / 60;
        System.out.print( seconds2 + ":" + seconds3 + ":" + seconds1);
        System.out.print("\n");
    }
}
