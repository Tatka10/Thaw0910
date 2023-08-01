public class Main
{
    public static void main(String[] args)
    {

      //  functionKrya();
       // functionKva(6);


        example2();


    }

    static void example2()
    {
//        functionKrya(3);
//        functionKrya(4, 3);
        functionSaySomething ("ква", 4, 3);

    }

//     static void functionKrya(int k, int m)
//     {
//         for (int i=0; i<k; i++){
//
//         }
//
//    }

//    static void functionKrya(int k)
//    {
//        for (int i=0; i<k; i++)
//            System.out.println("кря");
//    }

//    static void functionKrya(int k)
//    {
//        for (int i=0; i<k; i++)
//            System.out.println("кря");
//    }

//    static void functionKrya()
//    {
//        for (int i=0; i<7; i++)
//            System.out.println("кря");
//    }
//    static void functionKva(int k)
//    {
//        for (int i=0; i<k; i++)
//            System.out.println("ква");
//    }


    static void functionSaySomething(String voice, int k, int howlong)
    {
        for (int i=0; i<k; i++)
        {
            for (int j=0; j<howlong; j++) {
                System.out.print(voice);
            }
            System.out.println();
        }

    }

}