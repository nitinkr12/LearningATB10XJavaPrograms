package ex07feb;

public class Labex_57_InvertedRightTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}