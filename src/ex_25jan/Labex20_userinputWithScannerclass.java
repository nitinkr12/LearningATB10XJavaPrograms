package ex_25jan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Labex20_userinputWithScannerclass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1");
        int side1=sc.nextInt();
        System.out.println("Enter side2");
        int side2=sc.nextInt();
        System.out.println("Enter side3");
        int side3=sc.nextInt();

       // if(side1==side2 || side1

                       // 89==side3 ||side3==side1 )
        {
            System.out.println("ABC is an isosceles triangle ");
        }

        //// else if (side1==side2 && side2==side3 && side3==side1)
        {
            System.out.println("ABC is an equilateral triangle ");
        }
        //else
        {
            System.out.println("ABC is an scalene triangle ");
        }


    }
}
