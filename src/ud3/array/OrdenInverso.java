package ud3.array;

import java.util.Random;

public class OrdenInverso {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        final int MAX_RANDOM = 100;
        int[] numeros = new int[LONGITUD];
        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(MAX_RANDOM + 1);
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    // pasandolo como copia
    // otra forma
    static int[] invertir(int[] t) {
        int[] t2 = new int[t.length];

        for (int i = 0; i < t.length; i++)
            t2[i] = t[t.length - i - 1];

        return t2;
    }
}
