//George Lupu, 2/27/25, grade average


import java.util.*;
public class GradeAvg {


    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    int avarage;



    public static void main(String[]arges){

        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        int avarage;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a grade ");
    grade1 = input.nextInt();
    System.out.println("Enter a grade ");
    grade2 = input.nextInt();
    System.out.println("Enter a grade ");
    grade3 = input.nextInt();
    System.out.println("Enter a grade ");
    grade4 = input.nextInt();
    System.out.println("Enter a grade ");
    grade5 = input.nextInt();
    
        avarage = (grade1 + grade2 + grade3 + grade4 + grade5) /5;

        System.out.println("Youe avg is " + avarage);
    }
    
}
