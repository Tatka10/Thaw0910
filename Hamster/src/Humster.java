//Упр. Создать класс Хомяк. У хомяка должны быть характеристики (приватные поля) имя, вес и цвет. Хомяк должен уметь сообщать данные о себе (метод).
//У класса Хомяк должен быть конструктор, который принимает 3 поля.
//Создать геттеры и сеттеры на каждое поле.
//Мы не должны уметь присваивать хомяку отрицательный вес.
//
public class Humster {
    private String name;
    private double weight;
    private String colour;

    public Humster(String name, double weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка");
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void say() {
        System.out.println("Хомяк " + name + " имеет вес " + weight + " и цвет " + colour);
    };
}
