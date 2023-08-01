import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        сделать программу вычисления площади треугольника
        по длинам 3 сторон.
        Длина каждой стороны - вещественное число, которое вводит
        пользователь. Длина стороны не может быть меньше 0

        Требуется сделать отдельную функцию для ввода длины стороны с проверкой,
        отдельную функцию вычисления площади

        *дополнительно сделать функцию проверки неравенства треугольника

         */


        Triangle myTriangle = new Triangle();
        myTriangle.displayInfo();


    }

    // треугольник
    static class Triangle
    {
        double sideA;
        double sideB;
        double sideC;

        double perimeter;
        double area;

        boolean NotEquil;

        double perimeter()
        {
            return sideA+sideB+sideC;
        }
        double area()
        {
            double p = perimeter/2;
            return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        }

        void displayInfo()
        {
            System.out.println("sideA="+sideA+" sideB="+ sideB + " sideC="+ sideC + " perimeter=" + perimeter + " area=" + area + " NotEquil=" + NotEquil);
        }

        boolean isNotEquil()
        {
            return (sideA<(sideB+sideC)&&sideB<(sideA+sideC)&&sideC<(sideA+sideB));
        }

        Triangle(double a, double b, double c)
        {
            sideA = a;
            sideB = b;
            sideC = c;

            perimeter = perimeter();
            area = area();
            NotEquil = isNotEquil();
        }

        Triangle()
        {
            sideA = askForSide();
            sideB = askForSide();
            sideC = askForSide();

            perimeter = perimeter();
            area = area();
            NotEquil = isNotEquil();
        }

        static double askForSide()
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("введите сторону треугольника");
            double x = safeReadDouble();
            while (x<=0) {
                System.out.println("число должно быть положительным");
                x = safeReadDouble();
            }
            return x;
        }

        static double safeReadDouble() {
            boolean wasError;
            double x = 0;
            Scanner scanner = new Scanner(System.in);
            do {
                wasError = false;
                if (!scanner.hasNextDouble()) {
                    scanner.next();
                    wasError = true;
                    System.out.println("Ошибка!");
                }
            }
            while (wasError);
            x = scanner.nextDouble();

            return x;
        }



    }

}