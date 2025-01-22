package ex_19jan;

public class Labex13_userinput

{
    public static void main(String[] args) {
    String Name=args[0];
    String Age=args[1];
    String  Salary=args[2];

    int newage=Integer.parseInt(Age);
    int newsalary=Integer.parseInt(Salary);
    System.out.println("Name is:" + Name);
    System.out.println("Age is:" + newage);
    System.out.println("Salary is:" + newsalary);



        //Take a user input - Name, Age and Salary and print them in the end.
    }
}
