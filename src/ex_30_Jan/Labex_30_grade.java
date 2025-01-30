package ex_30_Jan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Labex_30_grade {
    public static void main(String[] args) {
        float marks;

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter marks");
            marks=sc.nextFloat();

            if(marks>=0 && marks<=100)
            {
                if(marks>=90 && marks<=100)
                {
                    System.out.println("your grade is A+");
            }
                else if(marks>=80 && marks<=89)
                {
                    System.out.println("your grade is A");
                }
                else if(marks>=70 && marks<=79)
                {
                    System.out.println("your grade is B");
                }

               else if(marks>=60 && marks<=69)
                {
                    System.out.println("your grade is c");
                }
                else if(marks>=50 && marks<=99)
                {
                    System.out.println("your grade is D");
                }
                else if(marks>=40 && marks<=59)
                {
                    System.out.println("your grade is E");
                }
                else
                {
                    System.out.println("fail");
                }
            }} catch( InputMismatchException e)
        {
            System.out.println("Enter valid marks");
        }
    }
}
