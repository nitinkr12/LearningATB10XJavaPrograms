package ex_25jan;

public class Labex17_fizbuzz
{
    public static void main(String[] args) {
        //1-100
        //num/3= Fizz
        //num/5=Buzz
        //num/3 or num/5=FizzBuzz

        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.println("Fizz");
            } else if (i%5==0)
            {
                System.out.println("Buzz");


        } else if(i%3==0 && i%5==0)
            {
            System.out.println("FizBuzz");
            }
            else{

                System.out.println(i);
            }


        }}}
