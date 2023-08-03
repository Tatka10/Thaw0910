public class Student extends Human {

    public boolean isHeadman;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("все на бегу");
    }


}
