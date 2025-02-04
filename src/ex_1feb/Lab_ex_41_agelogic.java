package ex_1feb;

import java.util.Scanner;

public class Lab_ex_41_agelogic
{
    public static void main(String[] args) {
        int Age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        Age=sc.nextInt();
        if(Age>=0 && Age<=12)
        {
            System.out.println("i am child");
        }
        else if(Age>=13 && Age<=19)
        {
            System.out.println("i am teenager");

        }
     else if(Age>=20 && Age<=64)
    {
        System.out.println("im adult");
    }
     else if(Age>=65)
        {
            System.out.println("im senior citizen");
        }

    }
}
