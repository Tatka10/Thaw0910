//Упр. Создать класс Хомяк. У хомяка должны быть характеристики (приватные поля) имя, вес и цвет. Хомяк должен уметь сообщать данные о себе (метод).
//У класса Хомяк должен быть конструктор, который принимает 3 поля.
//Создать геттеры и сеттеры на каждое поле.
//Мы не должны уметь присваивать хомяку отрицательный вес.
public class Main {
    public static void main(String[] args) {

        Humster humster = new Humster("Prohor", 9, "brown");
        humster.setName("Vanya");
        humster.setColour("black");
        humster.setWeight(45.9);
        humster.say();


        System.out.println(humster.getName());
        System.out.println(humster.getColour());
        System.out.println(humster.getWeight());


    }
}





