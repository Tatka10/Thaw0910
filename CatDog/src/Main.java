import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        exampleCat(3);

    }

    private static void exampleCat(int n) {
        Cat[] catArray = new Cat[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < catArray.length; i++) {
            System.out.println("введите имя котика");
            catArray[i] = new Cat(sc.nextLine());
        }
        for (int i = 0; i < catArray.length; i++){
            System.out.println(catArray[i].getName());
        }


    }
}
class Cat {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String s)
    {
        System.out.println("было имя "+name+" станет "+s);
        name = s;
    }

    public void say()
    {
        System.out.println("котик "+name+" говорит МЯУ");
    }

    public Cat()
    {
        setName( "безымянный");
    }

    public Cat(String name)
    {
        setName(name);
    }
}