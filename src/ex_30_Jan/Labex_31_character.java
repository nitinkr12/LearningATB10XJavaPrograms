package ex_30_Jan;

import java.util.Scanner;

public class Labex_31_character {
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character");
        c=sc.next().charAt(0);
        if((c>='a' && c<='z')|| (c>='A' && c<='Z'))
        {
            System.out.println("Its a character");
        }
     else
    {
        System.out.println("its not a character");
    }}}
