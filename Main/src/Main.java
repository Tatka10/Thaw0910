
public class Main {
    public static void main(String[] args) {

        String[] words = {"Вася", "Маша", "Гриша", "Петя", "Олечка", "Настя"};
        printmassreverse(words);
    }


    public static void printmassreverse(String[] mass) {

        for (int i = mass.length-1; i > -1; i--) {
            System.out.print(mass[i] + " ");

        }

    }


}
