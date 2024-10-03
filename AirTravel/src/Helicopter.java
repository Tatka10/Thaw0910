public class Helicopter extends AirTransport{
    public Helicopter(String name, double maxWeight) {
        super(name, maxWeight);
    }

    @Override
    public void takeOff(String from) {
        System.out.println( "Вертолет "+name+ "ракета уплывает вдаль из "+ from);
    }

    @Override
    public void land(String to) {
        System.out.println("Ракета"+name+ "разворачивается против движения, тормозит двигателем и мягко садится в"+ to);

    }

    @Override
    public void fly() {
        System.out.println( "Ракета летит по баллистической траектории");

    }
}
