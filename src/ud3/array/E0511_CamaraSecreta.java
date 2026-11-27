package ud3.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0511_CamaraSecreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual será la longitud de la combinación? ");
        int longitud = sc.nextInt();

        int[] combinacion = new int[longitud];
        Random rnd = new Random();
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = rnd.nextInt(1, 5 + 1);
        }

        System.out.print("Introducir combinación: ");
        int[] combinacionJugador = new int[longitud];
        for (int i = 0; i < combinacionJugador.length; i++) {
            combinacionJugador[i] = sc.nextInt();
        }

        boolean combinacionAcertada = Arrays.equals(combinacionJugador, combinacion);
        int contIntentos = 0;
        
        while (combinacionAcertada == false) {
            if (combinacionAcertada = Arrays.equals(combinacionJugador, combinacion)) {
                System.out.println("Combinación acertada!!!");
            } else {
                for (int i = 0; i < combinacion.length; i++) {
                    if (combinacionJugador[i] == combinacion[i]) {
                        System.out.println("Dígito acertado " + "-> " + combinacionJugador[i]);
                    } else if (combinacion[i] < combinacionJugador[i]) {
                        System.out.println("El dígito es menor que " + "-> " + combinacionJugador[i]);
                    } else {
                        System.out.println("El dígito es mayor que " + "-> " + combinacionJugador[i]);
                    }
                }

                System.out.println("---------------");
                System.out.println("Combinación: " + Arrays.toString(combinacion));
                System.out.println("---------------");

                contIntentos++; 

                System.out.println("\n" + "Introducir combinación (intento " + contIntentos + "):");
                for (int i = 0; i < combinacionJugador.length; i++) {
                    combinacionJugador[i] = sc.nextInt();
                }
            }
        }
        sc.close();
    }
}
