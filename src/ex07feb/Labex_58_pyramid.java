package ex07feb;

public class Labex_58_pyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++) {
                {
                    for (int k = 1; k >= j; k++)
                    {
                        System.out.println("*");
                    }
                }


                System.out.println();
            }
        }
    }
}