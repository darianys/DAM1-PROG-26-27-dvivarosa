package ud3.array;

import java.util.Arrays;

public class InsertarOrdenado {
    public static void main(String[] args) {
        int t[] = { 23, 43 };
        int Valor = 33;

        System.out.print(Arrays.toString(insertarOrdenado(t, Valor)));
    }

    static public int[] insertarEnPosicion(int[] t, int num, int pos) {
        int[] tAux = new int[t.length + 1];

        if (pos < 0 || pos > t.length) {
            throw new IllegalArgumentException("Posición fuera del rango");
        }

        for (int i = 0; i <= pos - 1; i++)
            tAux[i] = t[i];

        tAux[pos] = num;

        for (int i = pos + 1; i < tAux.length; i++)
            tAux[i] = t[i - 1];

        return tAux;
    }

    // Inserta posición tomando en cuenta el orden de menor a mayor
    static int[] insertarOrdenado(int[] t, int valor) {
        // posicion por defecto en caso de estar vacio 
        int pos = 0;

        // si el array no esta vacio ps se compara y se introduce donde debe
        if (t.length != 0) {
            while (t[pos] < valor) {
                pos++;
            }
        }

        return insertarEnPosicion(t, valor, pos);
    }

}
