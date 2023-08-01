import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int garry, larry, notgarry, notlarry;
        int i;
        Scanner chitalka = new Scanner(System.in);
        do {
            System.out.println("настрелял Гарри и Ларри не более 11 в сумме ");
            garry = chitalka.nextInt();
            larry = chitalka.nextInt();
            i++;
            }
        while ((garry + larry) > 11);



        notgarry = larry -1;
        notlarry = garry - 1;

        System.out.println("не настрелял Гарри и Ларри" + notgarry + " " + notlarry);


    }
}