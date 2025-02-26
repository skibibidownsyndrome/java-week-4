//2/25/2025, George Lupu

import java.util.*;

public class Digits {




public static void main(String[]args) {

    int number;
    //number = 2584;
    int ones;
    int tens;
    int hundreds;
    int thousands;
    

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 4 digit number");
    number = input.nextInt();

    thousands = number % 10;
    hundreds = (number / 10) % 10;
    tens = (number / 10 / 10) % 10;
    ones = (number / 10 / 10 /10) % 10;

    System.out.println("The ones digit is " + ones);
    System.out.println("The tens digit is " + tens);
    System.out.println("The hundreds digit is " + hundreds);
    System.out.println("The thousands digit is " + thousands);


    }

}
