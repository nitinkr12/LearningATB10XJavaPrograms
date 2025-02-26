package ex_23Feb;

import java.util.*;

public class Labex3 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("Ram");
        hs.add("Shyam");
        hs.add("nitin");
        hs.add(1233);
        hs.add(null);

        System.out.println(hs);

        LinkedHashSet lhs=new LinkedHashSet();
         lhs.add("nitin");
         lhs.add(5667);

        System.out.println(lhs);

        TreeSet ts=new TreeSet();
        ts.add("Ram");
        ts.add("Apple");
        ts.add("Mango");


        System.out.println(ts);



            }
        }
