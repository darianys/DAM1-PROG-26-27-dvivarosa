package ud2.bucles;

/**
 * @author Darianys Rosales
 */

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numSecreto = rnd.nextInt(1, 100 + 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el número que crea que es el secreto (-1 para rendirse):");
        int num = sc.nextInt();

        //no entro si se rinde o si es el número secreto
        while (num != -1 && num != numSecreto) {
            //trato si es mayor o menor
            if (num < numSecreto) {
                System.out.println("El número secreto es mayor...");
            } else {
                System.out.println("El número secreto es menor...");
            }
            num = sc.nextInt();
        }
        sc.close();
        //le agrego el if para tratar la condición de que al rendirse y ganar salga y no se siga ejecutando
        if (num == numSecreto) {
            System.out.println("Es el número secreto");
        } else {
            System.out.println("Suerte la próxima vez");
        }
        //cómo el else trata el -1?
    }
}
