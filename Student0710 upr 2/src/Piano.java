//Упр.4. Создайте интерфейс Playable с методом play(). Реализуйте этот интерфейс в классах Guitar и Piano. В методе play() выведите сообщение о том, что инструмент играет.
//Создайте класс ClassicGuitar, который наследуется от класса Guitar. Создайте для него свое собственное поле (например, количество струн), свой собственный метод, а также геттеры и сеттеры для своего поля.


public class Piano implements Playable {
    String name;
    int strings;
    String colour;

    public Piano(String name, int strings, String colour){
        this.name = name;
        this. strings = strings;
        this.colour = colour;

    }


    @Override
    public void play() {
        System.out.println( name + " am playing by 2 hands");

    }
}
