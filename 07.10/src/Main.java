//Упр.4. Создайте интерфейс Playable с методом play(). Реализуйте этот интерфейс в классах Guitar и Piano. В методе play() выведите сообщение о том, что инструмент играет.
//Создайте класс ClassicGuitar, который наследуется от класса Guitar. Создайте для него свое собственное поле (например, количество струн), свой собственный метод, а также геттеры и сеттеры для своего поля.

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Guitar Americano", "black");
        ClassicGuitar classicGuitar = new ClassicGuitar("classic Guitar  - My", "brown", 7);
        Piano piano = new Piano("Piano English", 30, "brown");

        guitar.play();
        classicGuitar.play();
        piano.play();
        classicGuitar.pianoSound();
        classicGuitar.setStrings(2);
        System.out.println( "String ="+ classicGuitar.getStrings());


    }
}
interface Playable {
    void play();
}