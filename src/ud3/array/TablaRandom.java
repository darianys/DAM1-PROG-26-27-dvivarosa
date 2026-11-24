package ud3.array;

import java.util.Arrays;
import java.util.Random;

public class TablaRandom {
    public static void main(String[] args) {
        int n = 10;
        System.out.print(Arrays.toString(tablaRandom(n)));
    }

    public static int[] tablaRandom(int n){
        int[] t = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(1, (100 + 1));
        }

        return t;
    }

}
