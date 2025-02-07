package ex07feb;

import java.util.Scanner;

public class Labex_53_multiplication {
    public static void main(String[] args) {
        int no;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int new_num=no*i;
            System.out.println(new_num);
        }
    }
}
