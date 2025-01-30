package ex_29JAN;

import java.util.Scanner;

public class Labex21_PositiveOrNegative {

    public static void main(String[] args) {


       int num;
       System.out.println("Enter num");
         Scanner sc = new Scanner(System.in);
      num= sc.nextInt();

        if (num > 0) {
            System.out.println("its a positive no");
        }
        else if(num < 0)
        {
            System.out.println("Its a negative no");

        } else if (num==0) {
            System.out.println("its 0");
        }

        else {
            System.out.println("its not a number");
        }


        }
    }
