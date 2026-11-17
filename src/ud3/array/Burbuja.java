package ud3.array;

import java.util.Arrays;
import java.util.Random;

public class Burbuja {
    public static void main(String[] args) {
        int tabla[] = new int[20];

        Random rnd = new Random();

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rnd.nextInt(1, 100 + 1);
        }

        Arrays.sort(tabla);
        System.out.print(Arrays.toString(tabla));
    }
}
