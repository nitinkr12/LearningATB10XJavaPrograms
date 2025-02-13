package ex09Feb;

public class Labex_9_Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 3; k <= 3*i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}



