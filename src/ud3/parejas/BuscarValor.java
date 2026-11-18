package ud3.parejas;

import java.util.Arrays;
import java.util.Random;

public class BuscarValor {
    static int encontrarPosicion(int[] t, int clave) {

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave)
                return i;
        }
        return -1;
    }

    static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] numeros = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }

        return numeros;
    }

    static int[] insertarAlFinal(int[] t, int valor) {
        int[] tAux = new int[t.length + 1];

        for (int i = 0; i < t.length; i++)
            tAux[i] = t[i];

        tAux[tAux.length - 1] = valor;

        t = tAux;

        return t;
    }

    public static void main(String[] args) {

        int[] t = arrayAleatorio(10, 5, 50);
        t = insertarAlFinal(t, 20);
        System.out.println(Arrays.toString(t));

        System.out.println(encontrarPosicion(t, 4));

    }
}