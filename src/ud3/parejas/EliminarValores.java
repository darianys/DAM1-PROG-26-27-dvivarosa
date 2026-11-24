package ud3.parejas;
/**
 * @author Aiko Serrano y Darianys Rosales
 *
 */
import java.util.Arrays;
import java.util.Random;

public class EliminarValores {
    static int[] eliminarValores(int[] t, int valor) {
        int[] tAux = new int[t.length];
        int cont = 0;

        for (int i = 0; i < tAux.length; i++) {
            if (t[i] == valor) {
                cont++;
            } else {
                tAux[i - cont] = t[i];
            }
        }
        int[] tAux2 = new int[t.length - cont];
        for (int i = 0; i < tAux2.length; i++) {
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

        int t[] = {2, 3, 4, 5, 6, 7, 8}; 

        System.out.println(Arrays.toString(eliminarValores(t, 5)));

    }
}
