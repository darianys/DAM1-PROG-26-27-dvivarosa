package ud3.array;

import java.util.Arrays;
import java.util.Random;

public class E0508 {
    public static void main(String[] args) {
        int n = 10;
        int contPos = 0;
        int contNeg = 0;
        int t[] = tablaRandom(n);
        System.out.println(Arrays.toString(t));

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                contPos++;
            } else {
                contNeg++;
            }
        }

        int[] tPos = new int[contPos];
        int[] tNeg = new int[contNeg];

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                for (int j = 0; j < tPos.length; j++) {
                    if (t[i] % 2 == 0)
                    System.out.print(" " + t[i] + " ");
                    tPos[j] = t[i];
                }
            } else {
                for (int j = 0; j < tNeg.length; j++) {
                    tNeg[j] = t[j];
                }
            }
        }

        //Arrays.sort(tPos);
        //Arrays.sort(tNeg);

        System.out.println(Arrays.toString(tPos));
        System.out.println(Arrays.toString(tNeg));

    }

    public static int[] tablaRandom(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(1, (100 + 1));
        }

        return t;
    }
}
