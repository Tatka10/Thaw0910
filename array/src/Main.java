import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nums[];  int[] nums2;
        nums = new int[4];
        int nums3[] = new int [4];
        int nums4[] = new int[] { 1, 2, 3, 4  };
        int[] nums5 = { 1, 2, 3, 4 };
        nums5[3] = 100;
//      int nums6[] = new int[]; нельзя создать безразмерный массив
        System.out.println(nums5[3]);
//      System.out.println(nums5[4]); //ошибка - нет пятого элемента
        System.out.println(Arrays.toString(nums5));

        int ar1[] = inputArray();
        System.out.println(Arrays.toString(ar1));


        outputArray(ar1);




    }

    // ввести массив произвольной длины
    static int[] inputArray (){
        System.out.println("введите целочисленное значение длины массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int massiv[] = new int[size];
        System.out.println("введите целый элемент массива'");
        for (int i = 0; i< massiv.length; i++){
            massiv[i] = scanner.nextInt();
        }
        return massiv;
    }

    static  void outputArray(int massiv[]){
        System.out.println("Массив:");
        for (int i: massiv){
            System.out.print(i + " ");
        }
        System.out.println(";");
    }




}