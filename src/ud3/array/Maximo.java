package ud3.array;

import java.util.Random;

public class Maximo {
    public static void main(String[] args) {
        int tabla[] = new int[10];
        Random rnd = new Random();

        int maximo = 0;
        int indice = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rnd.nextInt(1, 100 +1);
            System.out.print("[ " + tabla[i] + " ]");
            if (tabla[i] >= maximo) {
                maximo = tabla[i];
                indice = i;
            }
        }
        System.out.println("");
        System.out.println(maximo);
        System.out.println(indice);
    }
}
