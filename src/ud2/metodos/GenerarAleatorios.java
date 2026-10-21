package ud2.metodos;

import java.util.Random;

public class GenerarAleatorios {
    public static int generarAleatorios(int cantidad, int min, int max) {
        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(min, max + 1);

        for (int i = 0; i < cantidad; i++) {
            numAleatorio = rnd.nextInt(min, max + 1);
            System.out.println(numAleatorio);
        }
        return numAleatorio;
    }

    public static void main(String[] args) {
        generarAleatorios(10, 1, 99);
    }
}
