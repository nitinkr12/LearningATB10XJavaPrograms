package ex_29JAN;

import java.util.Scanner;

public class Labex22_EvenOrOdd {
    public static void main(String[] args) {


    int num;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
    num= sc.nextInt();
    if(num%2==0) {
        System.out.println(num + " is even number");
    }else
        {
            System.out.println(num +" is odd number");
        }
    }
}