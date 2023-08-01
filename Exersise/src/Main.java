import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    example1();
    example2();
    example3();


    }

    static void example2(){
        Box box1 = new Box();
        box1.a=19;
        Box box2 = new Box();
        box2.a=func3(box1);
        System.out.println(box1.a + "  " + box2.a);
    }

    static int func3(Box box){
        box.a--;
        return box.a + 10;
    }

    class Box{
        int a;
    }

    static void example1(){
        int a = 12;
        int b = 15;
        int c = func1(a);
        System.out.println(a+b+c);
        a=func2 (a,b);
    }

    static int func1(int a){
        a++;
        return a;
    }

    static int func2(int a, int b){
        b+=a;
        return a+b;
    }

}