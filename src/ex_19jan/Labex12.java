package ex_19jan;

public class Labex12

{
    public static void main(String[] args) {
        int a=12;
        int b=89;
        int c=22;
        String max=(a>b && a>c)? "A is max" :(b>a && b>c? " b is m,max": " c is max");
        System.out.println( max);
    }
}
