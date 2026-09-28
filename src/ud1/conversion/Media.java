package ud1.conversion;
/**
 *@author Darianys Rosales
 */

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe las tres notas: ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3.;
        System.out.printf("La media es de: %.2f %n", media);

        sc.close();
    }

}
