import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите длину первого массива");
        int a = sc.nextInt();
        System.out.println("введите длину второго массива");
        int b = sc.nextInt();

        int allDistanceFirst = a-1; // общая длина исходной аллеи
        int allDistanceLast = b-1; // общая длина конечной аллеи

        int k = 1; // расстояние между деревьями
        for (k = 1; (allDistanceLast*k+1)<allDistanceFirst ; k++) {} // расчет максимально возможного расстояния между деревьями
        System.out.println("макс расст между соседними деревьями: " + k);

        int res=0; // количество комбинаций


            for (int i = 0; i < a; i++) {                    // проходим циклом по начальной аллее деревьев
                if ((a - i) >= b) res++;                    // деревья посаженные в ряд с единичным расстоянием
                for (int j=2; j<=k ; j++) {                 // проходим по всем возможным расстояниям между соседними деревьями
                    if (((b - 1) * j) + i + 1 <= a) res++;  // деревья посаженные с кратным расстоянием
                }
            }
            System.out.println("всего способов: " + res);
    }
}