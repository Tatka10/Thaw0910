
//написать метод, которые принимает число N с консоли и массив числе, внутри метода в цикле делит N на каждый элемент массива и выводит результат в консоль
//если встречаетсч 0, то выбрасывается исключение

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N");
        int n = scanner.nextInt();
        double[] mass = {1, 5, 4, 6, 7, 8, 9, 7, 1};
        metod(mass, n);


    }

    public static void metod(double[] txt, int n) {

        try {
            for (double v : txt) {
                if (v == 0) {
                    throw new OurException("Error, Zero");
                } else {
                    System.out.print(n / v + "  ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


