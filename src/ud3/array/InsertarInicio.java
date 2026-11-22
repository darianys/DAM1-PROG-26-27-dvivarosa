package ud3.array;

import java.util.Arrays;

public class InsertarInicio {
    public static void main(String[] args) {
        int t[] = { 1, 7, 9, 10, 12 };
        int num = 3;

        System.out.println(Arrays.toString(insertarAlInicio(t, num)));
    }

    static public int[] insertarAlInicio(int[] t, int num) {
        int[] tAux = new int[t.length + 1];

        for (int i = 0; i < t.length; i++) {
            tAux[i + 1] = t[i];
        }

        tAux[0] = num;

        return tAux;
    }
}
