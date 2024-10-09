//Упр.1. Создать класс Student. Конструктор класса Student принимает имя, возраст и факультет студента.
//Создать Два интерфейса: Readable и Sleepable. Интерфейсы должны содержать методы без реализации.
//Класс Student реализует оба интерфейса.
//Создать конкретных студентов.
//упр 2 - добавить к интерфейсам Readable и Sleepable константы, посмотреть, есть ли у студентов доступ к этим константам
//упр 3- в классе Main, например, создать статиечкий метод reading, который в качестве параметра принимает объеккт типа Readable и вызывает метод read/

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Anton", 19, "Facultet of biology");
        student.read();
        student.sleep();
        System.out.println(student.DREAM + " " + student.FONT);
        // student.DREAM = "lOCAL "; - константу нельзя изменить!
        Readable student1 = new Student("Akela", 21, "facultet of chemistry");
        reading(student1, student.name);
        student1.read();
         Sleepable student2= new Student("Zhora", 25, "facultet of chem");
         student2.sleep();
    }

    ;

    public static void reading(Readable student, String name) {
        System.out.println(name + " I am reading");

    }
}

interface Readable {
    String FONT = "Time new roman";

    void read();
}

interface Sleepable {
    String DREAM = "Sweet dreams";

    void sleep();
}