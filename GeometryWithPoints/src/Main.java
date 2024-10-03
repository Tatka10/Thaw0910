public class Main {
    public static void main(String[] args) {
        Triangle[] massiv = getTriangles();
        double avgPerimeter = calcAvgPerimeter(massiv);     //вычислить средний периметр треугольников в массиве
        System.out.println(avgPerimeter);
// Figure figo = new Figure (); нельзя создать объект абстрактного класса
    }


}

private static Triangle[] getTriangles() {
    //Triangle[] massiv = new Triangle[4];
    Triangle[] massiv = {new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4))
            , new Triangle(new Point(3, 4), new Point(3, 0), new Point(0, 4))
            , new Triangle(new Point(5, 5), new Point(5, 0), new Point(0, 5))
            , new Triangle(new Point(3, 4), new Point(3, 0), new Point(0, 0))};
    return massiv;
}


private static double calcAvgPerimeter(Triangle[] massiv) {
    double avgPerimeter = 0;
    for (Triangle tr : massiv) {
        avgPerimeter = avgPerimeter + tr.perimeter();
    }
    avgPerimeter /= massiv.length;  //avgPerimeter = avgPewrimeter/massiv.length
    return avgPerimeter;
}
    }


