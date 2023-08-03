public class Professor extends Human {

    public Professor(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("прихожу в группу");
    }


    public void askQuestion(GroupOfStudent group) {

    }
}
