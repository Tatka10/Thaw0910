//Оттепель

import java.util.Scanner;

//Уставшие от необычно теплой зимы, жители решили узнать, действительно ли это самая длинная оттепель за всю историю наблюдений за погодой. Они обратились к синоптикам, а те, в свою очередь, занялись исследованиями статистики за прошлые годы. Их интересует, сколько дней длилась самая длинная оттепель.
//
//Оттепелью они называют период, в который среднесуточная температура ежедневно превышала 0 градусов Цельсия. Напишите программу, помогающую синоптикам в работе.
//
//Входные данные
//Во входном файле INPUT.TXT сначала записано число N – общее количество рассматриваемых дней (1 ≤ N ≤ 100). В следующей строке через пробел располагается N целых чисел, разделенных пробелами. Каждое число – среднесуточная температура в соответствующий день. Температуры – целые числа и лежат в диапазоне от –50 до 50.
//
//Выходные данные
//В выходной файл OUTPUT.TXT требуется вывести одно число – длину самой продолжительной оттепели, то есть наибольшее количество последовательных дней, на протяжении которых среднесуточная температура превышала 0 градусов. Если температура в каждый из дней была неположительной, выведите 0.
//Примеры
//№	INPUT.TXT	OUTPUT.TXT
//1	6
//-20 30 -40 50 10 -10	2
//2	8
//10 20 30 1 -10 1 2 3	4
//3	5
//-10 0 -10 0 -10	0
public class Main {
    public static void main(String[] args) {
        int mass[] = readData();
        int result = getMaxLeghtOfPositive(mass);

    }

    public static int[] readData() {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите число дней");
        int days = x.nextInt();
        System.out.println("Введите среднесуточную температуру");
        int[] mass = new int[days];
        for (int el : mass) {
            el = x.nextInt();
        }
        return mass;
    }


    public static int getMaxLeghtOfPositive(int[] massiv) {
        int number = 0;
        int maxLeght = 0;
        for (int el : massiv) {
            if (el > 0) {
                number = number + 1;
                maxLeght = maxLeght + 1;
            } else if (el < 0) {
                number = 0;
            }
            if (number > maxLeght) {
                maxLeght = number;
            }
        }
        System.out.println(maxLeght);
        return maxLeght;
    }

    public static void showResult(int result) {
        System.out.println("Длина продолжительной оттепели" + result);

    }
}