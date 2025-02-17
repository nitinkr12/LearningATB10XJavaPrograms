package ex09Feb;

public class Labex_sortMin {
    public static void main(String[] args) {
        int[] arr1={90,65,91,56,55};
        Labex_sortMin aa=new Labex_sortMin();
        aa.min(arr1);

    }

    public  void min(int[] arr1)
    {
        int min=arr1[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<min)
            {
                min=arr1[i];
                //System.out.println(min);
            }


        }
        System.out.println(min);
    }
}

