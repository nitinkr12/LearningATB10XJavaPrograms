package ex16feb;

public class Vehicle {

    public int max_speed=180;

    Vehicle()
    {
        System.out.println("I am default constructor");
    }

    Vehicle(int a)
    {        System.out.println("I am parametrized constructor");
    }
     void message()
     {          System.out.println("I am simple function");
     }
    void message(int a )
    {              System.out.println("I am paramerized function");
    }

    void display()
    {
        System.out.println("im parent display");
    }

    void test()
    {
        System.out.println("im vehicle no test");
    }
}
