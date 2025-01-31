package ex_31_Jan;

import java.util.Scanner;

public class Labex_35_Armstrong {
    public static void main(String[] args) {
        int num;
        int sum=0;
        int new_num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        num=sc.nextInt();
        new_num=num;
        while(num>0)
        {
            sum=sum+(num%10)*(num%10)*(num%10);
            num=num/10;
        }
    if(sum==new_num)
    {
        System.out.println("its an armstrong no");
    }else {
        System.out.println("its not armstrong");
    }
}}
