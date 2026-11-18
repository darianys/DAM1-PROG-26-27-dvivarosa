package ud3.parejas;

import java.util.Arrays;
import java.util.Random;

public class FiltrarMayores {
    static int[] filtrarMayoresQue(int[] t, int limite) {
        int[] tAux = new int[t.length];
        int contador = 0;

        for (int i = 0; i < t.length; i++){
            if (t[i] > limite) {
                tAux[contador] = t[i];
                contador++;
            }
        }
        int[] tAux2 = new int[contador];

        for (int i = 0; i < contador; i++){
           tAux2[i] = tAux[i];
        }

        return tAux2;
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
        int[] t = arrayAleatorio(10, 5, 11);

        t = insertarAlFinal(t, 21);
        t = insertarAlFinal(t, 50);
        t = insertarAlFinal(t, 34);
        

        System.out.println(Arrays.toString(filtrarMayoresQue(t, 20)));
    }
}
