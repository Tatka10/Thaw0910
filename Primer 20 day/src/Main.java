
public class Main {
    public static void main(String[] args) {

        int[] mass = {5, 6, 7, 8, 9};

        metod(mass);

        }



    public static int[] metod(int[] arr) {
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception err) {
            System.out.print("Error " + err.getMessage());
        }
    return arr;}
}
