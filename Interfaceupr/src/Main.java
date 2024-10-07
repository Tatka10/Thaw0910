import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.print();
        System.out.println(book1.TEXTCOLOR);
        Journal journal1= new Journal();
        journal1.print();
        Printable book2=new Book();
        Printable journal2 = new Journal();
        book2.print();
        journal2.print();
    }
}

interface Printable {
    String TEXTCOLOR = "black"; // константа
    void print();
}
