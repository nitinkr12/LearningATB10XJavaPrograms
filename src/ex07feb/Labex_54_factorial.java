package ex07feb;

import java.util.Scanner;

public class Labex_54_factorial {
    public static void main(String[] args) {
        //5=5*4*3*2*1
        int no;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        int fact=1;
        for(int i=no;i>0;i--)
        {
           fact=fact*i;
           // System.out.println(fact);
        }
        System.out.println(fact);


    }
}
