package ud3.array;

import java.util.Arrays;

public class E0507 {
    public static void main(String[] args) {
        int t[] = {5, 19, 22, 23, 26, 26, 27};

        System.out.print(Arrays.toString(sinRepetidos(t)));    
    }

     public static int[] sinRepetidos(int t[]){
        int tAux[] = new int [t.length]; 
        int cont = 0; 

        for (int i = 0; i < tAux.length; i++) {
            if (tAux[i] == t[i]) {
                cont++;
            }else{
                tAux[i] = t[i];
            }
        }

        int tAux2[] = new int [tAux.length - cont];
        for (int i = 0; i < tAux2.length; i++) {
            tAux2[i] = tAux[i];
        }

        return tAux2;
     } 
}
