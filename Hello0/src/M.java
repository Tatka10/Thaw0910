public class M{

    public static void main (String args[]){

        double s, p, a, b, c, x, y, z, max;
        a = 10;
        b= 15;
        c= 20;
        x = 18;
        y= 10;
        z= 15;

        p=(a+b+c)/2;

        s= Math.sqrt((p-a)*(p-b)*(p-c));

        System.out.println("p = " + p);

        String sss = "Вася";

        System.out.println(sss);

        Point point = new Point();
        point.x= 11;
        point.y = 14.9;

        Point point2 = new Point();
        point2.x= 0;
        point2.y = 5;

        System.out.println(point.sq());

        point.print();

        max=x;
        if (y>max) {max=y;}
        if (z>max) {max=z;}

        System.out.println(max);




    }
}

class Point{
    double x, y;

    double sq(){
        return x*y;
    }

    void print()
    {
        System.out.println(("x= " + x + ";  y= " + y));
    }

}