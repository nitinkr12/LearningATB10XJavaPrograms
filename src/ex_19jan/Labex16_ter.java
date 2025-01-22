package ex_19jan;

public class Labex16_ter
{

    public static void main(String[] args) {
        String a=args[0];
        String b=args[1];

        int a1=Integer.parseInt(a);
        int b1=Integer.parseInt(b);
        String Max=a1>b1? "a1 is max" :(a1==b1 ? "a1 is equals to b1":"b1 is max");
        System.out.println(Max);

    }
}
