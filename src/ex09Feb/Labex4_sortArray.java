package ex09Feb;

public class Labex4_sortArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};
        Labex4_sortArray ar1=new  Labex4_sortArray();
        int max=ar1.max(arr);
        System.out.println(max);
    }
      public int max(int[] arr)
        {
         int max=arr[0];
         for(int i=0;i<arr.length;i++)
         {
         if(arr[i]>max)
         {
             max=arr[i];
         }}
         return max;
        }


       }

