package ud1.examen;

import java.util.Scanner;

/**
 * @author Darianys Sinayd Vivas Rosales
 * NotaUD
 */

public class NotaUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introducir la nota de la prueba teórica: ");
        double pruebaTeorica = sc.nextDouble();

        System.out.print("Introducir la nota de la prueba práctica: ");
        double pruebaPractica = sc.nextDouble();

        System.out.print("Introducir la nota del trabajo de aula (introducir -1 en caso de que no tenga): ");
        double trabajoAula = sc.nextDouble();
      
        double notaUD = pruebaTeorica * 0.4 + pruebaPractica * 0.6;

        //nota que incluye el trabajo de aula
        double notaTotal =  (pruebaTeorica * 0.4 + pruebaPractica * 0.6 + trabajoAula * 0.2) / 1.2;

        System.out.printf((pruebaTeorica < 5 || pruebaPractica < 5 )
        ? "La UD no fue superada, la nota máxima será un 4"
        : "La nota de la UD es: %.2f", notaUD);

        System.out.printf((trabajoAula == -1) ? " " : "La nota UD más el trabajo diario es: %.2f", notaTotal);

        sc.close();

    }
}
