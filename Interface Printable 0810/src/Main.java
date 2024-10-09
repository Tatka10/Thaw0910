//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.

//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.
public class Main {
    public static void main(String[] args) {

        Printable[] mass = {new Book("Vogue", 50),
                new Magazine("Journal", "white", 25),
                new Book("Dog Dingo", 67),
                new Magazine("Kitchen", "Other colours", 45)};

        for (Printable el : mass) {
            System.out.println(" ");
            el.print();
            ;
        }

    }
}

interface Printable {
    void print();
}
