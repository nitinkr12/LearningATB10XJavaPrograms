package ex_30_Jan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Labex27_smallestfTwo {

    public static void main(String[] args) {

        int num1;
        int num2;

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num1");
            num1=sc.nextInt();
            System.out.println("Enter num2");
            num2=sc.nextInt();

            if(num1<num2)
            {
                System.out.println(num1 +" is smallest");
            }
            else if( num2<num1)
            {
                System.out.println(num2 + " is smallest");
            }
            else if(num1==num2)
            {
                System.out.println("num1 and num2 are equals");

            }

        }catch(InputMismatchException e)
        {
            System.out.println(" Enter valid numbers");
        }
    }

}
