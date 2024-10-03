public class Airplane extends AirTransport{
    public Airplane(String name, double maxWeight) {
        super(name, maxWeight);
        System.out.println("Создаем Самолет");
    }

    @Override
    public void takeOff(String from) {
        System.out.println( "Самолет "+name + " разбегается и взлетает из аэропорта"+ from);
    }

    @Override
    public void land(String to) {
        System.out.println( "Самолет "+name + " приземляется и тормозит в "+ to);
    }

    @Override
    public void fly() {
        System.out.println( "Самолет "+name+ "летит на заданной высоте");

    }
}
