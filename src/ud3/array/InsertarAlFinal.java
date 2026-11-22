package ud3.array;

import java.util.Arrays;

public class InsertarAlFinal {
    public static void main(String[] args) {
        int t[] = {27, 5, 22, 26, 19, 25};
        int num = 28;

            System.out.println(Arrays.toString(insertarAlFinal(t, num)));

        
    }
    static public int[] insertarAlFinal(int[] t, int num){
        int[] tAux = new int[t.length + 1];

        for (int i = 0; i < t.length; i++) {
            tAux[i] = t[i];
        }

        tAux[tAux.length - 1] = num;

        return tAux;
    }
}
