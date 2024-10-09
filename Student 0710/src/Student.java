public class Student implements Readable, Sleepable {
    String name;
    int age;
    String facultetStud;

    public Student(String name, int age, String facultetStud) {
        this.name = name;
        this.age = age;
        this.facultetStud = facultetStud;
    }


    @Override
    public void read() {
        System.out.println(name + " read book");

    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping ");

    }
}

