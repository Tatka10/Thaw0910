public class Dirijable extends AirTransport {
    public Dirijable(String name, double maxWeight) {
        super(name, maxWeight);
        System.out.println( "Создаем дирижабль");
    }

    @Override
    public void takeOff(String from) {
        System.out.println( "Дирижабль " +name + " зажигает огонь для взлета из "+from);
    }

    @Override
    public void land(String to) {
        System.out.println( "Дирижабль "+ name +" спускает газ и приземляется в "+to);

    }

    @Override
    public void fly() {
        System.out.println( "Дрижабль " +name+ " летит над облаками");

    }
}
