package ex_19jan;

public class Labex11_letterGrade

{  /*A: 90-100

    B: 80-89

    C: 70-79

    D: 60-69

    F: 0-59*/

    public static void main(String[] args) {

                int marks=60;
      String Grade= marks>=90&& marks<=100?"grade A":(marks>=80&& marks<=89? "grade b":(marks>=70&& marks<=79? "grade c":(marks>=60&& marks<=69? "grade d": "grade f")));
        System.out.println(Grade);
    }
}
