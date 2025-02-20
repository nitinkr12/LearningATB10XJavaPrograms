package ProgramPractise;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr={6,8,5,4,1,3};
        int CountEven=0;
        int CountOdd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+" "+"is even no");
                CountEven=CountEven++;
            }
            else
            {
                System.out.println(arr[i]+" "+"is Odd no");
                CountEven=CountOdd++;
            }
        }


    }
}
