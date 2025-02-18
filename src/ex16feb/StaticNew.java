package ex16feb;

public class StaticNew {
    public static void main(String[] args) {
        Static s=new Static(1,"nitin");
        Static s1=new Static(2,"Yatin");
        System.out.println(s.name);
        System.out.println(s.Rollno);
        System.out.println(s1.Rollno);
        System.out.println(s1.name);
        System.out.println(Static.classname);
    }

}
