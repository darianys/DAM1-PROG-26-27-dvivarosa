package ud3.array;

import java.util.Arrays;
import java.util.Random;

public class Pares {
    public static void main(String[] args) {
        int longitud = 25;
        int fin = 50;

        int[] pares = rellenaPares(longitud, fin);
        System.out.println(Arrays.toString(pares));
    }

    static int[] rellenaPares(int longitud, int fin) {
        int t[] = new int[longitud];
        Random rnd = new Random();
        int tPares[] = new int[longitud];

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(2, fin + 1) * 2;
            if (t[i] % 2 == 0) {
                tPares[i] = t[i];
            }
        }
        Arrays.sort(tPares);

        return tPares;
    }
}
