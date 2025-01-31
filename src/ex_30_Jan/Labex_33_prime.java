package ex_30_Jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Labex_33_prime {
    public static void main(String[] args) {
        int num;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
        if(num%i==0)
        {
            count++;
        }}
        if(count==2)
        {
            System.out.println(num + " is  a prime no");
        }
        else
        {
            System.out.println(num + " is not a prime no");
        }


    }
}
