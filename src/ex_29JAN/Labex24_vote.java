package ex_29JAN;

import java.util.Scanner;

public class Labex24_vote {
    public static void main(String[] args)

    {
    int age;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
    age= sc.nextInt();
    if(age>=18)
    {
        System.out.println("you can vote");
    }
    else
    {
        System.out.println("you cant vote");
    }

}}
