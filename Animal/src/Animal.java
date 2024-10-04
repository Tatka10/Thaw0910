public abstract class Animal {
    String name;
    String colour;
    double weight;

    public Animal(String name, String colour, double weight) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;

    }

    public abstract void run();
};


