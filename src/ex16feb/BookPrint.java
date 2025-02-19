package ex16feb;

public class BookPrint {
    public static void main(String[] args) {
        Book mybook=new PrintMyBook();
        mybook.getDetails("Harry Potter", "J.k. Rowling", 120);
        System.out.println(mybook.name +"," +mybook.author +"," +mybook.price);
}
}