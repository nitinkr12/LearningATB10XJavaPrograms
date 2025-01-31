package ex_31_Jan;

import java.util.Scanner;

public class Lab_ex36_Loan {
    public static void main(String[] args) {
        int Age;
        double Salary;
        int Credit_Score;
        double Minimum_Salary = 30000;
        int Minimum_Credit_Score = 650;
        int Max_credit_score = 850;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        Age = sc.nextInt();
        System.out.println("Enter Salary");
        Salary = sc.nextDouble();
        System.out.println("Enter Credit_Score");
        Credit_Score = sc.nextInt();

        if (Age > 0) {
            if (Age >= 18 && Age <= 80) {
                if (Salary > 0) {
                    if (Salary >= Minimum_Salary) {
                        if (Credit_Score > 0) {
                            if (Credit_Score >= Minimum_Credit_Score && Credit_Score <= Max_credit_score) {
                                System.out.println("loan passed successfully");
                            } else {
                                System.out.println(" loan cannot passed because credit score should be in between 650 and 850");
                            }
                        } else {
                            System.out.println(" loan cannot passed because, credit score should be greater tha 0");
                        }
                    } else {
                        System.out.println("loan cannot passed because, salary should be greater than" + Minimum_Salary);
                    }

                } else {
                    System.out.println("loan cannot passed because ,salary should be greater than 0");
                }

            } else {
                System.out.println("loan cannot passed because ,Age should be in between 18 to 80");
            }
        } else {
            System.out.println("loan cannot passed, Age should be greater than 0");
        }
    }



             }

