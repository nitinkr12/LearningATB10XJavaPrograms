package ex16feb;

public class Car  extends Vehicle {

    private int max_speed = 200;

    Car()
    { super(100);}

    Car(int a)
    {
        System.out.println("Im car parametrized const");
    }

    void test()
    {
        System.out.println("im car test");
    }

    @Override
    void display() {
        System.out.println(super.max_speed);
        System.out.println(this.max_speed);
        super.test();


    }
}