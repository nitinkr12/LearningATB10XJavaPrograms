package ex_31_Jan;

import java.util.Scanner;

public class Labex_34_palindrom {

    public static void main(String[] args) {

        {  String str;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter string");
            str=sc.next();
            String reverse_str="";
            for(int i=0;i<str.length();i++)
            {
                reverse_str=str.charAt(i)+reverse_str;
            }
            System.out.println(reverse_str);
            if(str.equals(reverse_str))
            {
                System.out.println("Its a palindrome");
            }
            else
            {
                System.out.println("Its not a palindrome");
            }
    }
}}
