package ex_29JAN;

import java.util.Scanner;

public class Labex23_max {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number1");
        num1= sc.nextInt();
        System.out.println("Enter your number2");
        num2= sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num1 + " is max");
        }
        else if(num2>num1)
        {
            System.out.println(num2 + " is max");
        }
        else if(num1==num2)
        { System.out.println("num1 and num2 is equal");
        }

        else {
            System.out.println("its not a number");
        }

    }
}
