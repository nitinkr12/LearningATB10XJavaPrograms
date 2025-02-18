package ex16feb;

public class Enum1 {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexcode());
        System.out.println(Colors.RED);
        C1 c=new C1();
        c.abc();

    }
}
enum Colors{
    RED("#FF0000"),YELLOW("#FFC300 ");
    String hexcode;
    Colors(String  hexcode) {
        this.hexcode=hexcode;
    }
    String getHexcode()
    {
        return hexcode;
    }

}
