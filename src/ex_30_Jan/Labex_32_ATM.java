package ex_30_Jan;

import java.util.Scanner;

public class Labex_32_ATM {
    public static void main(String[] args) {
       final double account_balance=10000;
        double amount_withdraw;
        double updated_balance;
    Scanner sc=new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        amount_withdraw=sc.nextDouble();
    if(amount_withdraw>0 && amount_withdraw%100==0) {
        if (amount_withdraw <= account_balance) {
            updated_balance = account_balance - amount_withdraw;
            System.out.println("Amount withdraw successfully and Balance is " + updated_balance);
        } else if (amount_withdraw > account_balance) {
            System.out.println("insufficient balance");
        } else {
            System.out.println("amount should be greater than 0 and multiple of 100");

        }
    }   }
}
