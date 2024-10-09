//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.

public class Magazine implements Printable {
    String name;
    String colour;
       int numberOfPages;
    public Magazine(String name, String colour, int numberOfPages){
        this.name = name;
        this.colour=colour;
        this.numberOfPages = numberOfPages;

    }
       @Override
       public void print() {
           System.out.printf( "Mazagine +%s + was print by  %s + with %s pages",name, colour, numberOfPages );

       }
   }
