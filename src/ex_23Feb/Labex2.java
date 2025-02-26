package ex_23Feb;

import java.util.*;

public class Labex2 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList(5);
        LinkedList ln=new LinkedList();
        ln.add("im");
        System.out.println(ln);
        Vector vc= new Vector();
        vc.add(8);
        System.out.println(vc);

        //for each loop
        for(Object o:ln) {
            System.out.println(o);
            Iterator i=ln.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
            List<Integer> ll=new ArrayList();
            ll.add(89);
            ll.add(90);
            ll.add(56);

            Collections.sort(ll);

            Stack s=new Stack();
            s.push(8);
            s.push(90);
            s.pop();
            System.out.println(s);

        }

    }
}
