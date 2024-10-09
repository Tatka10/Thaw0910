//Упр. Создать класс Dog. В классе есть поля порода и имя. Переопределить в классе метод toString(), чтобы он выводил информацию о собаке в следующем виде:
//
//Порода собаки Бобик:  хаски.
//
//(где вместо Бобик и хаски подставляется имя и порода конкретной собаки)

public class Dog {
    String breed;
    String name;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Порода собаки " + name + ": " + breed;
    }
}


