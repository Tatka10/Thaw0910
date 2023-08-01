import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        Point pointArray[];

        System.out.println("расстояние между двумя точками = " + calculateDistance(a, b));
        System.out.println("площадь треугольника = " + calculateAreaTriangle(a, b, c));
        System.out.println("максимальный отрезок = " + maxLineSigment(a, b, c));

        pointArray = createArrayPoint();

        System.out.println("минимальный отрезок = " + findMinSegment(pointArray));




    }

    static double maxLineSigment(Point a, Point b, Point c) {
        double x, y, z, max;
        x=calculateDistance(a, b);
        y = calculateDistance(b, c);
        z = calculateDistance(c, a);
        max = x;
        if (y>max) max = y;
        if (z>max) max = z;
        return max;
    }

    static double calculateAreaTriangle(Point a, Point b, Point c) {

        return Math.abs((b.x-a.x)*(c.y-a.y)-(c.x-a.x)*(b.y-a.y))/2;
    }

    static double calculateDistance(Point a, Point b) {

        return Math.sqrt(Math.pow(Math.abs(a.x- b.x),2)+Math.pow(Math.abs(a.y-b.y),2) );
    }

    static class Point{
        double x;
        double y;

        Point(){
            System.out.println("введите два вещественных числа");
            Scanner sc = new Scanner(System.in);
            x= sc.nextDouble();
            y = sc.nextDouble();
        }
    }


    static  Point[] createArrayPoint(){
        int n;
        System.out.println("введите целое положительное число");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Point pointArray[] = new Point[n];

        for (int i=0; i<n; i++){
             pointArray[i] = new Point();
        }
        return pointArray;
    }

    static double findMinSegment(Point arr[]){
        double min = calculateDistance(arr[0], arr[1]);
        double x;
        for (int i=0; i< arr.length; i++){
            for (int j=(arr.length-1); j>i; j--){
                x = calculateDistance(arr[i], arr[j]);
                if (x<min){
                    min = x;
                }
            }
        }
        return min;
    }







}