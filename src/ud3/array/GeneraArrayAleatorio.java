package ud3.array;

import java.util.Arrays;
import java.util.Random;

public class GeneraArrayAleatorio {
    public static void main(String[] args) {
        int longitud = 10;
        int[] tablaB = arrayAleatorio(longitud);
        
        for (int i = 0; i < tablaB.length; i++) {
            System.out.print("[ " + tablaB[i] + " ]");
        }
         //o puedo imprimirse usando el toString:
         System.out.println(" ");
        System.out.println(Arrays.toString(tablaB));
    }
    static int[] arrayAleatorio(int n){
        int[] tabla = new int[n];
        
        Random rnd = new Random();

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rnd.nextInt(-9, 10);
        }
        return tabla;
    }
}
