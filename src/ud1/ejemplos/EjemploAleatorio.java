package ud1.ejemplos;

import java.util.Random;

public class EjemploAleatorio {
public static void main(String[] args) {
    //Numeros aleatorios random
    //puede ser con Math.random()
    //o con la clase Random()
    final int NUM_ALUMNOS = 30;
    System.out.println(Math.random());

    //aqui al multiplicarlo lo que hago es que me de 
    //algo aleatorio 
    //si lo quiero entero con round lo redondeo
    System.out.println((int) (Math.random() * NUM_ALUMNOS));

    int aleatorio = (int)(Math.random() * NUM_ALUMNOS + 1);
    System.out.println(aleatorio);

    //RANDOM
    //no puedo solo declararla: Random rnd
    //debo crear el objeto: con new Ranom()
    Random rnd = new Random();
    System.out.println(rnd.nextInt());
    System.out.println(rnd.nextInt(NUM_ALUMNOS) + 1);
    System.out.println(rnd.nextInt(1, NUM_ALUMNOS + 1));
}
}
