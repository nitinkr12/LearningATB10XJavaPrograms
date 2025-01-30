package ex_30_Jan;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Labex_26_LargestOfThree
{
    public static void main(String[] args) {

    int num1;
    int num2;
    int num3;
try{
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        num1=sc.nextInt();
        System.out.println("Enter num2");
        num2=sc.nextInt();
        System.out.println("Enter num3");
        num3=sc.nextInt();

        if(num1>num2 &&  num1>num3)
        {
            System.out.println(num1 +" is greatest");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2 + " is greatest");
        }
        else if(num1==num2 && num1==num3 && num2==num3)
        {
            System.out.println(" they are equal");
        }
        else if(num1==num2 && num1>num3)
        {
            System.out.println(num1 + ", num1 and num2 is greatest");
        }
        else if(num1==num3 && num1>num2)
        {
            System.out.println(num1+ ", num1 and num3  is greatest");
        }
        else if(num2==num3 && num2>num1)
        {
            System.out.println(num2+ ", num2 and num3  is greatest");
        }

        else
        {
            System.out.println(num3 + " is greatest");
        }
        }
        catch(InputMismatchException e)
    {
        System.out.println("Enter valid number");
    }

}


}
