package ex_23Feb;

import java.util.ArrayList;
import java.util.List;

public class Students1 {


    public static void main(String[] args) {
        Students s1=new Students("nitin",21);
        Students s2=new Students("nyitin",21);

        List l1=new ArrayList();
        l1.add(s1);
        l1.add(s2);

        System.out.println(l1);

        s1.print_details();
        s2.print_details();



    }
}
