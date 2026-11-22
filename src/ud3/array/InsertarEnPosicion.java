package ud3.array;

import java.util.Arrays;

public class InsertarEnPosicion {
    public static void main(String[] args) {
        int t[] = { 1, 2, 3, 2, 1 };
        int num = 3;
        int pos = 3;

        System.out.print(Arrays.toString(insertarEnPosicion(t, num, pos)));
    }

    static public int[] insertarEnPosicion(int[] t, int num, int pos) {
        int[] tAux = new int[t.length + 1];

        if (pos < 0 || pos > t.length) {
            throw new IllegalArgumentException("Posición fuera del rango");
        }

        for (int i = 0; i <= pos - 1; i++) {
            tAux[i] = t[i];
        }

        tAux[pos] = num;

        for (int i = pos + 1; i < tAux.length; i++) {
            tAux[i] = t[i - 1];
        }

        return tAux;
    }
}
