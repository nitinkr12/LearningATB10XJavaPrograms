package ex16feb;

interface InterfaceI1 {

   void start();
    void stop();
    default void me()
    {
        System.out.println("only default method allowed in interface");
    }
}
