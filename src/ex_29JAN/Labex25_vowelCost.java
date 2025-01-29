package ex_29JAN;

import java.util.Scanner;

public class Labex25_vowelCost {
    public static void main(String[] args) {
        String c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your STRING");
        c=sc.next();

        for(int i=0;i<c.length();i++)
        {
        if(c.charAt(i)=='a'|| c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u')
        {
            System.out.println(c.charAt(i) + " is vowel");

        }
        else
            {
                System.out.println(c.charAt(i) + " is consonant");
            }}
    }
}
