package ex09Feb;

public class Labex5_SortArrayWithoutUsingInbuiltFunc {

    public static void main(String[] args) {
        int[] arr={12, 34, 10, 1, 100, 3, 4, 32};
        int temp=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }} for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i] + " ");
                }




    }
}
