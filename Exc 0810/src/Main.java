// как сравнить имена у 2х кошек -через equals
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vox");
        Cat cat2 = new Cat("Vox");
        System.out.println(cat1.equals(cat2));

        //System.out.println(cat1.hashCode()); --хэш таблицы, генерирует уникальный код, пароль
       // System.out.println(cat1.getClass()); //отве - класс Кэт
     //   System.out.println(cat1.toString()); //переписали в классе Cat
        //Cat cat3 = cat2;
       // System.out.println("Имена одинаковые " + cat1.equals(cat2));  //ответ false  - ссылочные типы данных, поэтому разные ссылки, поэтому ответ false
        //System.out.println("Имена одинаковые " + cat3.equals(cat2));
    }
}
