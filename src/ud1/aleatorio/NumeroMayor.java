package ud1.aleatorio;

import java.util.Random;

public class NumeroMayor {
    public static void main(String[] args) {
        final int NUM_INICIAL = 1;
        final int NUM_FINAL = 50; 

        //Random        
        Random rnd = new Random(); 

        int numAleatorio = rnd.nextInt(NUM_INICIAL, NUM_FINAL + 1);
        System.out.println("Numero I: " + numAleatorio);

        int numAleatorio2 = rnd.nextInt(NUM_INICIAL, NUM_FINAL + 1);
        System.out.println("Numero II: " + numAleatorio2);

        int numAleatorio3 = rnd.nextInt(NUM_INICIAL, NUM_FINAL + 1);
        System.out.println("Numero III: " + numAleatorio3);

        int numAleatorio4 = rnd.nextInt(NUM_INICIAL, NUM_FINAL + 1);
        System.out.println("Numero IV: " + numAleatorio4);

        int mayor = numAleatorio > numAleatorio2  ? numAleatorio : numAleatorio2;
        System.out.println("El número mayor es: " + mayor);

        //3 números 
        int mayor3A =  mayor > numAleatorio3 ? mayor : numAleatorio3;
        System.out.println("El número mayor es: " + mayor3A);

        //tambien puede ser para el mayor de 3
        int mayor3B = Math.max(Math.max(numAleatorio, numAleatorio2), numAleatorio3);
        System.out.println("El número mayor es: " + mayor3B);

        //4 números
        int mayor4 =  mayor3A > numAleatorio4 ? mayor3A : numAleatorio4;
        System.out.println("El número mayor es: " + mayor4);

        
        //Math.random
        //(NUM_INICIAL + Math.random() * (NUM_MENOR - NUM_FINAL + 1)) = random entre 0 y 5 y el 6 y 10
        int numAleatorio5 = (int) (NUM_INICIAL + Math.random() * (NUM_FINAL - NUM_INICIAL + 1));
        System.out.println(numAleatorio5);

        int numAleatorio6 = (int) (NUM_INICIAL + Math.random() * (NUM_FINAL - NUM_INICIAL + 1));
        System.out.println(numAleatorio6);

        int mayor2 = numAleatorio5 > numAleatorio6  ? numAleatorio5 : numAleatorio6;
        System.out.println("El número mayor es: " + mayor2); 

        //TAMBIEN PUEDE SER CON Math.max
        int mayor5 = Math.max(numAleatorio5, numAleatorio6);
        System.out.println("El número mayor es: " + mayor5);
        
    }
}
