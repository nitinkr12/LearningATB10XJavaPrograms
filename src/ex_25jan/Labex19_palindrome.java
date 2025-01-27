package ex_25jan;

public class Labex19_palindrome {
    public static void main(String[] args) {
        String Current_str = "yatin";
        String rev_string = "";

        for(int j=0;j<Current_str.length();j++)
        {
            // System.out.println(j);
            rev_string= Current_str.charAt(j)+ rev_string;
           // System.out.println(rev_string);

        }
        System.out.println(rev_string);
        if (Current_str.equals(rev_string))
         {
             System.out.println("its a palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }
        }

    }
