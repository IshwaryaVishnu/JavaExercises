package se.lexicon;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int year;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a year");
        year = in.nextInt();


        String result;

        result = ((year % 4 == 0 && year % 100 != 0) ?
                "is a leap year." : (year % 400 == 0) ?
                "is a leap year." : "is not a leap year.");

        System.out.println(year + " " + result);
    }
}