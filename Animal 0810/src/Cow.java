//Упр. Создать класс Корова, который наследуется от класса Animal. В классе Animal есть поля name и age, а также конструктор, который инициализирует эти поля. В классе корова есть свое приватное поле - количество пятен (int), а также есть свой конструктор.
//Для класса корова создать геттеры и сеттеры для поля "количество пятен".
//В классе Корова переопределить метод hashCode(), чтобы для каждой коровы он генерировал свой хэш из количества пятен + 10.

public class Cow extends Animal {
    private int spots;

    public Cow(String name, int age, int spots) {
        super(name, age);
        this.spots = spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }

    public int getSpots() {
        return spots;
    }

    @Override
    public int hashCode() {
        return spots + 10;
    }

}