package ud3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtil {
    //Inicializar array con aleatorios
    public static void arrayAleatorio(int t[]){
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(1, 100 + 1);
        }
    }

    //Inicializar array desde teclado
    public static void arrayDesdeTeclado(int t[]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }
    //Obtener la suma de elementos de un array.
    public static int arraySummado(int t[]){
        int suma = 0;

        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }

        return suma;
    }

    //Imprimir array
    public static void arrayImprimido(int t[]){
        System.out.println(Arrays.toString(t));
    }

    //Imprimir array en orden inverso
    public static void arrayInvertido(int t[]){
        for (int i = t.length - 1; i >= 0; i--) {
        System.out.println("[ " + t[i] + " ]");
        }
    }

    //Obtener el Maximo
    public static int maximoArray(int t[]){
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < t.length; i++) {
            if (t[i] >= maximo) {
                maximo = t[i];
            }
        }
        return maximo;
    }

    //Obtener el Mínimo
    public static int arrayMinimo(int t[]){
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < t.length; i++) {
            if (t[i] <= minimo) {
                minimo = t[i];
            }
        }
        return minimo;
    }

    //Obtener la media
    public static int arrayMedia(int t[]){
        int suma = 0;

        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return (t.length > 0) ? suma / t.length : 0;
     }

    //Buscar valor
    public static int arrayEncontrarValor(int t[], int valor){
        int posicion = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                posicion = i;
            }
        }

        return posicion;
    }

    //Buscar desde el final
    public static int arrayBuscarFinal(int t[], int valor){
        int posicion = 0;

        for (int i = t.length - 1; i >= 0; i--) {
            if (t[i] == valor) {
                posicion = i;
            }
        }
        return posicion;
    }

    //Contar valores
    public static int arrayContarValores(int t[], int valor){
        int contValores = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                contValores ++;
            }
        }
        return contValores;
    }
}
