package ex_29JAN;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Labex21_PositiveOrNegative {

    public static void main(String[] args) {


       Double num;
       try {
           System.out.println("Enter num");
           Scanner sc = new Scanner(System.in);
           num = sc.nextDouble();
           sc.close();

           if (num > 0) {
               System.out.println("its a positive no");
           } else if (num < 0) {
               System.out.println("Its a negative no");

           } else if (num == 0) {
               System.out.println("its 0");
           }
       }
        catch(InputMismatchException e)
       {
            System.out.println("its not a number");
        }


        }

    }
