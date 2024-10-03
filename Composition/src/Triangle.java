public class Triangle {
    Dot p1, p2, p3;

    public Triangle(Dot p1, Dot p2, Dot p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double perimeter() {
        double side12 = p1.distanceDot(p2);
        double side23 = p2.distanceDot(p3);
        double side31 = p3.distanceDot(p1);

        return side31 + side12 + side23;
    }
}
