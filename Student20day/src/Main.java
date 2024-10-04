
//Try catch  - позволяет не выдавать ошибку - а работать программа
//finally - выполняем в любом случае
public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        try {int res = 3 / 0;
            System.out.println("res="+res);

        } catch (Exception e){
            System.out.println( "error! we cant do it");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println( "we in finally");
        }
        System.out.println("dalshe");
    }
}

