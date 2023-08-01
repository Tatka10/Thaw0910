import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x;
        Scanner chitalka = new Scanner(System.in);
        System.out.println("введите число ");
        x = chitalka.nextInt();
        System.out.println("вы ввели число " + x);

        System.out.println("введите вещественное ");
        double y = chitalka.nextDouble();

        System.out.println("вы ввели число " + y);

        System.out.println("сумма = " + (x+y));

        System.out.println("Кто взял Бастилию? ");

        String s1 = chitalka.nextLine();
        System.out.println("Бастилию взял " + s1);
    }





}