public class Circle  extends Figure{
    double radius;
    Point center;

    public Circle(double radius, Point center) {
        this.center = center;
        if (radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }

    // проверка пересечения с другой окржуностью
    public boolean isCrossesWith(Circle other) {
        double d = center.distanceTo(other.center);
        return !(d > radius + other.radius
                || radius + d < other.radius
                || other.radius + d < radius);
        }

    @Override
    public double perimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}


