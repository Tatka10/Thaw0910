//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.
public class Book implements Printable {
    String name;
    int numberOfPages;
    public Book (String name, int numberOfPages){
        this.name = name;
        this.numberOfPages=numberOfPages;



    }


     @Override
     public void print() {
         System.out.printf( "Book %s + with %s pages was print by 100 copies", name, numberOfPages);

     }
 }
