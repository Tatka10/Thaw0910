public class Engine {
    String type;
    int power;

    public Engine(String type, int power) {
        if (power > 0) this.power = power;
        else this.power = 0;
        this.type = type;
    }

    public String toString() {
        return "Двигатель {"+type+"мощность=" +power+"}";
    }
public void work(){
    System.out.println( "рррррр");
}
}
