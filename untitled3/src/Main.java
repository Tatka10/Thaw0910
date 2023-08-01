import java.util.*;

public class Main {
    public static void main(String[] args) {

        example1();
        example2();
        example3();
        example4();
        List<Debtor> debtorList = new LinkedList<>();
        debtorList.add(new Debtor());
        debtorList.add(new Debtor());
        debtorList.get(0).Name = "Вася";
        debtorList.get(1).Name = "Соня";
        debtorList.add(readDebtor());


        Queue<Debtor> = new Queue<>() // очередь

        TreeMap<String, Debtor> map1 = new TreeMap<>(); // словарь построенный на дереве
        // еще может быть на хэш, просто словаря не бывает
        map1.put("iygui", debtorList.get(0));
        map1.put("негшленш", debtorList.get(1));

       // ArrayList <String> myStringList = new ArrayList<String>() { "Петров", "Иванов", "Сидоров"};


    }

    static void example4() {
        Debtor debtors[] = new Debtor[3];
        for (int i=0; i<debtors.length; i++)
        {
            debtors[i] = readDebtor();
        }

        for (Debtor element: debtors) // цикл форич для массива
        {
            printDebt(element);
        }
    }

    static void example3() {
        final int n = 7;
        int massiv1[] = new int[n];
        int massiv2[] = {50,75,61,22,31,14};
        int matrix[][] = new int [n][n];
        System.out.println(massiv2[0]);
        for (int i=0; i<massiv2.length; i++){
            System.out.println( " элемент " + i + " равен " + massiv2[i]);
        }

        for (int element: massiv2) // цикл ворич для массива
        {
            System.out.println( " элемент равен " + element);
        }

        printArray(massiv2);

    }

    static void printArray(int m[]){
        for (int i=0; i<m.length; i++){
            System.out.println( " элемент " + i + " равен " + m[i]);
        }
    }

    static void example1() {
         String simpleName;
         int simpleAge;
         int simpleSum;
         Debtor d1 = new Debtor();
         d1.Name = "Grisha";
         d1.Age = 29;
         d1.Sum = 10222;
         printDebt(d1);
     }

    static void example2() {
        Debtor d2 = readDebtor();
        printDebt(d2);

    }

    static  void printDebt(Debtor d)
    {
        System.out.println(d.Name + " должен " + d.Sum);
    }

    static Debtor readDebtor()
    {
        Debtor misterX = new Debtor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как зовут");
        misterX.Name = scanner.next();
        System.out.println("Сколько лет");
        misterX.Age = scanner.nextInt();
        System.out.println("Какой долг");
        misterX.Sum = scanner.nextInt();

        return misterX;
    }

}

    class Debtor{
        String Name;
        int Age;
        int Sum;
    }