package ud1.examen;
/**
 * @author Darianys Sinayd Vivas Rosales
 * Esfera
 */

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el radio de la esfera: ");
        double radio = sc.nextDouble();
        sc.close();

        double areaSuperficie = 4 * Math.PI * Math.pow(radio, 2);

        //no debe realizarse asi porque tuve que agregar un .
        //sin el punto es un entero : 4. / 3
        //ya con esto me da
        double volumen =  4 / 3 * Math.PI * Math.pow(radio, 3);

        System.out.printf("El área de la superficie de la esfera es: %.2f %n", areaSuperficie);
        System.out.printf("El volumen de la esfera es: %.2f ", volumen);
    }
}
