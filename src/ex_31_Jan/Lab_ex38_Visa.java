package ex_31_Jan;

import java.util.Scanner;

public class Lab_ex38_Visa {
    public static void main(String[] args) {

        int Age;
        String Visa_Status;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        Age=sc.nextInt();
        System.out.println("Enter your visa_status");
        Visa_Status=sc.next();
        if(Age>0)
        {
            if(Age>=18)
            {
                if(Visa_Status=="valid")
                {
                    System.out.println("You can travel");
                }
               else
               {
                   System.out.println("you can't travel as visa is not valid");
               }
            }else
            {
                System.out.println("you can't travel as your age should be equals and greater than 18");

            }
        }    else
        {
        System.out.println("you can't travel as your age should be greater than 0");


    }

}}
