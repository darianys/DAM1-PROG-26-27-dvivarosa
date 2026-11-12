package ud3.array;

import java.util.Random;

public class AleatoriasSuma {
    public static void main(String[] args) {
        int tabla[] = new int [10];
        Random rnd = new Random();
        int suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rnd.nextInt(1, 100 + 1);
            System.out.println(tabla[i]);
            suma += tabla[i];
        }
        System.out.println(suma);
    }
}
