public class Dot {
    double x;
    double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceDot(Dot another) {
        //Применив формулу d = √((хА – хВ)2 + (уА – уВ)2), получим:
        double distanceDot = Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));
        return distanceDot;
    }
}
