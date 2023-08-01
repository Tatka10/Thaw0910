import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int x, count, sum, i;
        count = 0;
        Scanner myScanner = new Scanner(System.in);
//        while (true)
//        {
//            System.out.println("введите число ");
//            x = myScanner.nextInt();
//            if (x<0) break;
//            else count++;
//        }
//
//        System.out.println(count);

//        System.out.println("введите числа, закончите отрицательным ");
//        count=0;
//        x = myScanner.nextInt();
//        while (x>=0 )
//        {
//            count++;
//            x = myScanner.nextInt();
//        }
//
//        System.out.println(count);



//        System.out.println("введите числа, закончите отрицательным ");
//        do
//        {
//            x = myScanner.nextInt();
//            if (x>=0 ) count++;
//        }
//
//        while (x>=0 );
//
//
//        System.out.println(count);

    do
    {
    System.out.println("введите n");
    if (myScanner.hasNextInt())
    count = myScanner.nextInt();
    else {
        myScanner.next();
        }

    }
    while (count<1 || count>15);


        i=0;
        sum =0;
        boolean wasError = false;
        double avrg = 0;
        while (i <  count)
        {
            do
            {
                System.out.println("введите число");
                if (myScanner.hasNextInt())
                {
                    x = myScanner.nextInt();
                    i++;
                    wasError = false;
                    if (x>0)
                    {
                        sum += x;
                    }
                }
                else {
                    myScanner.next();
                    wasError = true;
                }
            }
            while (wasError);




            avrg = sum/count;
        }

        System.out.println(avrg);



    }
}