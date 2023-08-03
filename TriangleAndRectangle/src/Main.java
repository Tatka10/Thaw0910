import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        example1(getFigures());
        example2();
    }
    static void example1 (ArrayList<Figure> figList){
        double res=0;

        ArrayList<Figure> figureList = figList;

        for (Figure f: figureList) {
            res+=f.getArea();
            System.out.println(f.getClass() + " " + f.getArea());
        }
        System.out.println();
        System.out.println("сумма площадей "  + res);
    }

    private static ArrayList<Figure> getFigures() {
        ArrayList<Figure> figureList = new ArrayList<>();

        figureList.add(new Triangle(3,4,5));
        figureList.add(new Triangle(4,5,6));
        figureList.add(new Rectangle(5,6));
        return figureList;
    }

    static void example2 (){
        // читаем массив фигур из файла



    }



}

