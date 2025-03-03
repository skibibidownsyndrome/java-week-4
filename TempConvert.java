//George Lupu. 2/27/25



import java.util.*;
public class TempConvert {

public static void main(String[]args){

    double fahrenheit;
    double celcius;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter fahrenheit ");
    fahrenheit = input.nextInt();



    celcius = 5.0/9.0* (fahrenheit - 32);

    System.out.println("Celcius is: " + celcius);


    }

}
