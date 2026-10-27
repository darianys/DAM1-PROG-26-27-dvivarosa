package ud2.bucles;
/**
 * @author Darianys Rosales 
 */

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir la altura de los muros: ");
        int altura = sc.nextInt();
        int saltoArriba = altura;
        int contArriba = 0;
        int contAbajo = 0;

        while (altura != -1) {

            if (altura > saltoArriba)
                contArriba++;

            if (altura < saltoArriba)
                contAbajo++;

            saltoArriba = altura;

            altura = sc.nextInt();
        }
        sc.close();

        System.out.println("Saltos hacia arriba: " + contArriba);
        System.out.println("Saltos hacia abajo: " + contAbajo);
    }
}
