import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        example1();
        example2();
        example3();
    }

    static void example3(){
        String fileName = "aaa.txt";
        String fileName2 = "bbb.txt";
        try{
            Scanner sc = new Scanner(new File(fileName));
            int x = sc.nextInt();
            FileWriter output = new FileWriter((new File(fileName2)));
            String s = "значение равно" + x*2;
            output.write(s);
            sc.close();
            output.close();
        }
        catch(FileNotFoundException r){
            System.out.println("нет файла");
            System.out.println(r.getMessage());
        }
        catch(IOException e){
            System.out.println("нет файла");
        }
    }
    static void example2(){
        String fileName = "aaa.txt";
        try{
            Scanner sc = new Scanner(new File(fileName));
            int x = sc.nextInt();
            System.out.println(2*x);
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("файл " + fileName + "не найден");
        }

    }
    static void example1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое число");
        try {
            int x = sc.nextInt();
            System.out.println(2*x);

        }
        catch (InputMismatchException e)
        {
            System.out.println("как-то не так ввели число");
        }
        catch (Exception e)
        {
            System.out.println("исключение");
        }

        System.out.println("продолжаем работу");
    }


}