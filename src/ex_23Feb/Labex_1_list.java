package ex_23Feb;

import java.util.ArrayList;
import java.util.List;

public class Labex_1_list {
    public static void main(String[] args) {
        List l=List.of("Apple","Mango");
        System.out.println(l);

        ArrayList ls=new ArrayList<>();
        ls.add("nitin");
        ls.add("Yatin");
        ls.add("sumit");
        ls.add(1);
        System.out.println(ls);
        System.out.println(ls.size());
        System.out.println(ls.isEmpty());
        System.out.println(ls.contains("Yatin"));
        System.out.println(ls.contains(1));

   List mylist=new ArrayList();
   mylist.add(1);
   mylist.add(2);
        System.out.println(mylist);

        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }

}}
