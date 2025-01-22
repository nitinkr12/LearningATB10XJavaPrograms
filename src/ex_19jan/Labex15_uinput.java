package ex_19jan;

public class Labex15_uinput
{
    public static void main(String[] args) {
       // int age=25;
       String age= args[0];
       /* String age= args[1];
        String age= args[2];*/

        int newage=Integer.parseInt(age);
        String canIGoToGoa= newage>=25 ? "yes" :"no";
        System.out.println(canIGoToGoa);
        System.out.println(newage);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
