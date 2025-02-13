package ex09Feb;

import java.util.Scanner;

public class Labex07_righttriangle {
    public static void main(String[] args) {
        System.out.println("Enter the i");
        int k;
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
         for(int i=0; i<k;i++)
         {
             for(int j=k;j>i;j--)
             {
                 System.out.print("*");

             }
             System.out.println("\n");
         }

    }
}
