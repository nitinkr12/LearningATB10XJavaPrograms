package ex_31_Jan;

import java.util.Scanner;

public class Lab_ex39_Bonus {

    public static void main(String[] args) {
        int Salary;
        double Year_Of_Exp;
        double bonus;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        Salary=sc.nextInt();
        System.out.println("Enter your exp");
        Year_Of_Exp=sc.nextDouble();
       if(Salary>0 && Year_Of_Exp>=0 )
       {
        if(Year_Of_Exp<=1)
        {
            System.out.println("NO bonus");
        }
        else if(Year_Of_Exp>=1 && Year_Of_Exp<=3) {
            bonus = Salary / 100 * 5;
            System.out.println("your bonus is " + bonus);
        }
       else if(Year_Of_Exp>=4 && Year_Of_Exp<=6)
           {
               bonus = Salary / 100 * 10;
               System.out.println("your bonus is " + bonus);
           }
        else if(Year_Of_Exp>=6 )
        {
            bonus = Salary / 100 * 15;
            System.out.println("your bonus is " + bonus);
        }}

        else {
           System.out.println("Enter valid salary and year of exp");

       }
    }}


