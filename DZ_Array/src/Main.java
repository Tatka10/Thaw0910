import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
        //1) сгенерировать массив заданной длины из случайных чисел от 0 до 99
        //2) найти номер минимального элемента в массиве
        //3) найти разность между максимальным и минимальным элементами
        //4) найти среднее арифметическое элементов массива
        //5) найти номер элемента, значение которого равно x
        //6) найти, сколько раз в массиве встречается число x
        //7) отфильтровать массив, сделав новый массив, содержащий элементы исходного массива,
        //   значения которых в интервале от p до q
        //8) найти значение элемента массива, максимально близкое к числу x




//        int ar1[] = inputArray();
//        System.out.println(Arrays.toString(ar1));

        int ar2[] = inputRndArray();
        System.out.println(Arrays.toString(ar2));

        System.out.println("минимальный номер массива: " + indexOfMinInt(ar2));

        System.out.println("разность между максимальным и минимальным элементами: " + subtractionMaxMin(ar2));

        System.out.println("среднее арифметическое элементов массива: " + Arrays.stream(ar2).average());

        System.out.println("номер элемента, значение которого равно 7: " + indexOfIntArray(ar2, 7));

        System.out.println("сколько раз встречается число 7: " + countOfElementIntArray(ar2, 7));

        System.out.println("новый массив, содержащий элементы исходного массива,\n" +
                "        //   значения которых в интервале от 30 до 70 : " + Arrays.toString(newArray(ar2, 30, 70)));

        System.out.println("значение элемента массива, максимально близкое к числу 50: " + aspiringToX(ar2, 50));

        //System.out.println("мин: " + armin(int[] ar2));


    }





    // задать размерность массива
    static int inputN() {
        System.out.println("введите целочисленное значение длины массива");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // ввести массив произвольной длины с клавы
    static int[] inputArray (){
        int size = inputN();
        int massiv[] = new int[size];
        System.out.println("введите целый элемент массива'");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< massiv.length; i++){
            massiv[i] = scanner.nextInt();
        }
        return massiv;
    }

    //сгенерировать массив заданной длины из случайных чисел от 0 до 99
    static int[] inputRndArray() {
        int size = inputN();
        int massiv[] = new int[size];
        for (int i = 0; i< massiv.length; i++){
            massiv[i] = createRndInt(100);
        }
        return massiv;
    }

    // сгенерировать случайное целое от 0 до a
    static int createRndInt(int a){
        Random r = new Random();
        return r.nextInt(a);
    }

    // найти первый индекс минимального элемента в целочисленном массиве
    static int indexOfMinInt(int [] arr){
        int[] ar = arr;
        int indexOfMin = 0;
        for(int i=0; i<ar.length; i++){
            if (ar[i]<ar[indexOfMin]) indexOfMin=i;
        }
        return indexOfMin;
    }

   // разность между максимальным и минимальным элементами
   static int subtractionMaxMin(int [] arr){
       int[] ar = arr;
       int min = Arrays.stream(ar).min().getAsInt();
       int max = Arrays.stream(ar).max().getAsInt();
       return max-min;
   }

    // номер элемента, значение которого равно x
    static int indexOfIntArray(int [] arr, int x){
        int[] ar = arr;
        int a = x;
        return IntStream.range(0, ar.length).filter(i -> ar[i] == x).findFirst().orElse(-1);
    }

    // сколько раз в массиве встречается число x
    static int countOfElementIntArray(int [] arr, int x){
        int[] ar = arr;
        int a = x;
        int res=0;
        for (int i: ar){
            if (i == a) res++;
        }
//        for (int i=0; i<ar.length; i++){
//            if (ar[i] == a) res++;
//        }

        return res;
    }

    //отфильтровать массив, сделав новый массив, содержащий элементы исходного массива,
    //   значения которых в интервале от p до q
    static int[] newArray(int [] arr, int p, int q){
        int[] ar = arr;
        int a = p;
        int b = q;
        int j = 0;
        int[] abc = new int[ar.length];
        for (int i=0; i<ar.length; i++){
            if ((ar[i] >= a) && (ar[i] <= b) ) {
                abc[j]=ar[i];
                j++;
            }
        }
        int[] res = new int[j];
        System.arraycopy(abc, 0, res,
                0, j);
        return res;
    }

    //значение элемента массива, максимально близкое к числу x
    static int aspiringToX(int [] arr, int x){
        int[] ar = arr;
        int a = x;
        int res = ar[0];
        int min = Math.abs(a-ar[0]);
        for (int i=0; i<ar.length; i++){
            if (Math.abs(a-ar[i])<min){
                min = Math.abs(a-ar[i]);
                res = ar[i];
            }
        }
        return res;
    }

}