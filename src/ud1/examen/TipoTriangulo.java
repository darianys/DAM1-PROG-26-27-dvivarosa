package ud1.examen;

import java.util.Scanner;

/**
 * @author Darianys Sinayd Vivas Rosales
 * TipoTriangulo
 */

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir la longitud de los tres lados separados por espacios: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();
        sc.close();

        System.out.println("El tipo de triángulo es: ");
        System.out.println((lado1 == lado2 && lado1 == lado3 && lado2 == lado3) 
        ? "Equilátero" : "Escaleno");
        System.out.println((lado1 == lado2 && lado2 != lado3 || lado1 != lado2 && lado2 == lado3 || lado1 == lado3 && lado2 != lado3) ? "Isósceles" : "Escaleno");
        
    }
}
