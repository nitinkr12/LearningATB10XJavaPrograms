package ex07feb;

import java.util.Scanner;

public class Labex_55_primeno
{
    public static void main(String[] args) {

        int no;
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        for(int i=2;i<=no;i++)
        {
            if(no*i==no)
            {
                System.out.println(no +" is  a prime no");
                break;
            }
            else {

                System.out.println(no +" is not a prime no");
            }

        }
        }
    }

