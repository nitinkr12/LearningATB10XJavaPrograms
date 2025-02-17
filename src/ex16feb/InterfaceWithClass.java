package ex16feb;
public class InterfaceWithClass implements InterfaceI1,Interface2
    {




        @Override
        public void pass () {
            System.out.println("it is passed");
        }

        @Override
        public void start () {
            System.out.println("it starts");
        }

        @Override
        public void stop () {
            System.out.println("it stop");
        }
    }
