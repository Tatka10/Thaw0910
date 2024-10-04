public class Squirrel extends Animal {
    private String breed;
    private int age;

    public Squirrel(String name, String colour, double weight, String breed, int age) {
        super(name, colour, weight);
        this.breed = breed;
        this.age = age;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
public void setAge(int age){
        this.age=age;
}

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void run() {
        System.out.println("Белка" + name + " поднимает хвостик и быстро шевеля лапками бежит");

    }
}
