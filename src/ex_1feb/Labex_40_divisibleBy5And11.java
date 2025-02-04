package ex_1feb;

import java.util.Scanner;

public class Labex_40_divisibleBy5And11 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your num");
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println(num + " is divisible by 5 and 11 ");
        }
        else
        {
            System.out.println(num + " is not divisible by 5 and 11 ");

        }

    }}

