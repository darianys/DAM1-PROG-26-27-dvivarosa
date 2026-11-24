package ud3.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtil {

    // Inicializar array con aleatorios
    public static void arrayAleatorio(int t[]) {
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(1, 100 + 1);
        }
    }

    // Inicializar array desde teclado
    public static void arrayDesdeTeclado(int t[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }

    // Obtener la suma de elementos de un array.
    public static int arraySummado(int t[]) {
        int suma = 0;

        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }

        return suma;
    }

    // Imprimir array
    public static void arrayImprimido(int t[]) {
        System.out.println(Arrays.toString(t));
    }

    // Imprimir array en orden inverso
    public static void arrayInvertido(int t[]) {
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.println("[ " + t[i] + " ]");
        }
    }

    // Obtener el Maximo
    public static int maximoArray(int t[]) {
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < t.length; i++) {
            if (t[i] >= maximo) {
                maximo = t[i];
            }
        }
        return maximo;
    }

    // Obtener el Mínimo
    public static int arrayMinimo(int t[]) {
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < t.length; i++) {
            if (t[i] <= minimo) {
                minimo = t[i];
            }
        }
        return minimo;
    }

    // Obtener la media
    public static int arrayMedia(int t[]) {
        int suma = 0;

        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return (t.length > 0) ? suma / t.length : 0;
    }

    // Buscar valor
    public static int arrayEncontrarValor(int t[], int valor) {
        int posicion = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                posicion = i;
            }
        }

        return posicion;
    }

    // Buscar desde el final
    public static int arrayBuscarFinal(int t[], int valor) {
        int posicion = 0;

        for (int i = t.length - 1; i >= 0; i--) {
            if (t[i] == valor) {
                posicion = i;
            }
        }
        return posicion;
    }

    // Contar valores
    public static int arrayContarValores(int t[], int valor) {
        int contValores = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                contValores++;
            }
        }
        return contValores;
    }

    // Array invertido
    static int[] invertir(int[] t) {
        int[] t2 = new int[t.length];

        for (int i = 0; i < t.length; i++)
            t2[i] = t[t.length - i - 1];

        return t2;
    }

    // Insertar en el ultimo
    static int[] insertarU(int[] t, int valor) {
        int[] tAux = new int[t.length + 1];

        for (int i = 0; i < tAux.length; i++)
            tAux[i] = t[i];

        tAux[tAux.length - 1] = valor;
        return tAux;
    }

    //Insertar en el primero
    static int[] insertarP(int[] t, int valor){
        int[] tAux = new int[t.length + 1];
        for (int i = 0; i < t.length; i++)
            tAux[i + 1] = t[i];

        tAux[0] = valor;
        return tAux;
    }

    //Insertar en cierta posición
    static int[] insertarPosicion(int[] t, int num, int pos){
        //ERROR
        if (pos < 0 || pos > t.length) 
            throw new IllegalArgumentException("Indice fuera del rango");
        
        int[] tAux = new int[t.length + 1];

        //copiar elementos anteriores a pos
        for (int i = 0; i < pos; i++) {
            tAux[i] = t[i];
        }
        //copiar elementos posteriores a pos
        for (int i = pos; i < t.length; i++) {
            tAux[i + 1] = t[i];
        }

        //insertar valor en pos
        tAux[pos] = num;
        return tAux;
    }

    //Array aleatorio con inicio y fin
     static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] numeros = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }

        return numeros;
    }

    //Insertar valor de forma ordenada
    static int[] insertarOrdenado(int[] t, int valor) {
        // posicion por defecto en caso de estar vacio 
        int pos = 0;

        // si el array no esta vacio ps se compara y se introduce donde debe
        if (t.length != 0) {
            while (t[pos] < valor) {
                pos++;
            }
        }

        return insertarPosicion(t, valor, pos);
    }

    //Esta ordenado? si o no
    static boolean estaOrdenado(int[] t){
        if (t.length < 2)
            return true;

        for (int i = 1; i < t.length; i++) {
            if (t[i-1] > t[i])
                return false;
            }
        return true;
    }
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt();
            Arrays.toString(numeros);
        }

    }
}
