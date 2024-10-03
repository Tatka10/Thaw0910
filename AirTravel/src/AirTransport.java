////Создать класс ВоздушныйТранспорт
//        //у которого будет метод путешествоватьПоВоздуху (из А в Б),
//        //содержащий: взлет, полет, приземление
//        //
public abstract class AirTransport {
    String name;
    double maxWeight;

    public AirTransport(String name, double maxWeight) {
        System.out.println( "Создаем воздушный транспорт");
        this.name = name;
        this.maxWeight = maxWeight;
    }

    public abstract void takeOff(String from);

    public abstract void land(String to);

    public abstract void fly();


    public void travelByAir(String from, String to) {
        takeOff(from);
        fly();
        land(to);
    }
}


