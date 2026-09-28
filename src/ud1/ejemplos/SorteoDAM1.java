package ud1.ejemplos;

import java.util.Random;

public class SorteoDAM1 {
    final int NUM_ALUMNOS = 30;

    Random rnd = new Random();
    int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;
    
    //System.out.println("Numero elegido: " + numeroElegido);

}
