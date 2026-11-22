package ud3.array;

import java.util.Arrays;
import java.util.Random;

public class AleatoriosIFL {
    public static void main(String[] args) {
        int t[] = tablaAleatoria(5, 45, 5);
        System.out.println(Arrays.toString(t));
        
    }
    static int[] tablaAleatoria(int numInicio, int numFin, int longitud){
        int[] t = new int[longitud];
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(numInicio, numFin + 1);
        }
        return t;
    }
}
