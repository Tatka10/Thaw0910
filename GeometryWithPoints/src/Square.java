public class Square extends Figure {
    double side;

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
