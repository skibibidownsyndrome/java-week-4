//2/25/2025, George Lupu

public class Digits {




public static void main(String[]args) {

    int number;
    number = 2584;
    int ones;
    int tens;
    int hundreds;
    int thousands;
    
    thousands = number % 10;
    hundreds = (number / 10) % 10;
    tens = (number / 10 / 10) % 10;
    ones = (number / 10 / 10 /10) % 10;

    System.out.println(ones);
    System.out.println(tens);
    System.out.println(hundreds);
    System.out.println(thousands);



    }

}
