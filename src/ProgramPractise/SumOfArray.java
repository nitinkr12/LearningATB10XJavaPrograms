package ProgramPractise;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={1,10,8,3,9,0,2};
        System.out.println("Enter array elements");
        int[] arr1=new int[10];
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc1.nextInt();
        }

      //  System.out.println(arr1);
        int sum1=0;
        for(int j=0;j<arr1.length;j++)
        {
            sum1=arr1[j]+sum1;
        }
        System.out.println("sum of an array is" +" " +sum1);



        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=arr[i]+sum;
        }
        System.out.println("sum of an array is" +" " +sum);
    }

}
