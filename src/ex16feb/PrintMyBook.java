package ex16feb;

public class PrintMyBook extends Book
{



    @Override
    void getDetails(String name_s, String author_A, int price_p) {
        this.name=name_s;
        this.author=author_A;
        this.price=price_p;

    }
}


