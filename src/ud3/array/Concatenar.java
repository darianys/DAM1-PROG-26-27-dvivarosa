package ud3.array;

import java.util.Arrays;

public class Concatenar {
    public static void main(String[] args) {
        int t1[] = { 1, 3, 5, 7, 9, 11 };
        int t2[] = { 2, 4, 6, 8, 10, 12 };

        int concatenado[] = concatenar(t1, t2);
        for (int i = 0; i < concatenado.length; i++) {
        }

        Arrays.sort(concatenado);
        System.out.println(Arrays.toString(concatenado));

    }

    public static int[] concatenar(int t1[], int t2[]) {
        int[] tAux = new int[t1.length + t2.length];

        for (int i = 0; i < t1.length; i++) {
            tAux[i] = t1[i];
        }

        for (int i = tAux.length - t1.length; i < tAux.length; i++) {
            tAux[i] = t2[i - t1.length];
        }

        return tAux;
    }
}
