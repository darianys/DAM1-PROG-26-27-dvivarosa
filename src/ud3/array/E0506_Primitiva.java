package ud3.array;

import java.util.Arrays;

public class E0506_Primitiva {
    public static void main(String[] args) {
        int apuesta[] = {22, 40, 73, 86};
        int ganadora[] = {40, 6, 83, 86}; 

        System.out.println(numAciertos(apuesta, ganadora));
        
    }
    
    static int numAciertos(int[] apuesta, int[] ganadora){
        Arrays.sort(ganadora);
        int aciertos = 0;
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
             if (apuesta[i] == ganadora[j]) {
                aciertos ++;
             }   
            }
        } 
        return aciertos;
    }

}
