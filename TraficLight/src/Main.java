import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n=7; // перекрестков
        int m=10; // тоннелей

        int[] ar1={5,3,7,5,7,6,6,7,2,5}; // начала тоннелей
        int[] ar2={1,2,1,2,4,5,4,5,1,3}; // окончания тоннелей

        int[] traficLight = new int[n]; // итоговый массив с колвом светофоров

        for (int k=1; k<=n; k++) { //проход по всем перекресткам
            for (int i = 0; i < ar1.length; i++) { // проход по началам и концам тоннелей
                // если перекресток является началом или концом тоннеля - добавляем этому перекрестку светофор
                if ((ar1[i] == k) || (ar2[i] == k)) traficLight[k-1]++;
            }
        }
        System.out.println(Arrays.toString(traficLight));

    }
}