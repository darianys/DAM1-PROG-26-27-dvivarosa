package ud2.bucles;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(1, 11);

        for (int i = numAleatorio; ; ) {
            System.out.println(i);
        }
    }
}
