package ex_2Feb;

public class Lab_ex41_stringConcepts {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        System.out.println(str1==str2);//true ,because checking the memory allocation using ==
        System.out.println(str1==str3);// false, because memory uis allocated not in same place
        System.out.println(str1.equals(str3));// true checking the content
         String name1="Sonal";
         String name2="Sonal Patel";

       //charAt
        System.out.println(name1.charAt(0));

        //concat
        System.out.println(name1.concat(name2));

        //contains

        System.out.println(name1.contains("nitin"));

        //equals

        System.out.println(name1.equals(name2));

        //equalignore

        System.out.println(name1.equalsIgnoreCase("sonal"));

        //indexOf
        System.out.println(name1.indexOf('o'));

        //length

        System.out.println(name1.length());

        //replace

        System.out.println(name1.replace('o','O'));


        //split

        String[] split=str3.split("e");

        System.out.println(split[1]);

        //substring

        System.out.println(name1.substring(1,4));

        //tolowercase

        System.out.println(name1.toLowerCase());

        //touppercase

        System.out.println(name1.toUpperCase());

        //replace all

        System.out.println(name1.replace('o','p'));

        //startwith

        System.out.println(name1.startsWith("h"));

        //endwith
        System.out.println(name1.endsWith("o"));

        //isempty

        System.out.println(name1.isEmpty());

        //trim
        String st="     nitin";
        System.out.println(st.trim());

        //compareto

        System.out.println(name1.compareTo(st));

        //comparetoignorecase

        System.out.println(str1.compareToIgnoreCase(name1));

        //lastindex
        System.out.println(name1.lastIndexOf('n'));

        //  repeat()
        System.out.println(name1.repeat(2));

        //stringbuilder

        StringBuilder stringBuilder = new StringBuilder("nitin");
        stringBuilder.append("kumar");
        System.out.println(stringBuilder);
















    }
}
