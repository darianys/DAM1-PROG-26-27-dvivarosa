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

        //System.out.println("El tipo de triángulo es: ");
        //System.out.println((lado1 == lado2 && lado1 == lado3 && lado2 == lado3) 
        //? "Equilátero" : "Escaleno");
        //System.out.println((lado1 == lado2 && lado2 != lado3 || lado1 != lado2 && lado2 == lado3 || lado1 == lado3 && lado2 != lado3) ? "Isósceles" : "Escaleno");
        
        //se hace conm boolean
        boolean equilatero = (lado1 == lado2 && lado1 == lado3 && lado2 == lado3);
        boolean escaleno = (lado1 != lado2 && lado1 != lado3 && lado2 != lado3);

        //pasa a ser innecesario esto porque ya pasa a ser la única opcion restante
        //boolean isosceles = lado1 == lado2 && lado1 != lado3
            //|| lado1 != lado3 && lado1 == lado2
            //|| lado2 == lado3 && lado2 != lado1;

            //puedo de esta forma anidar el ternario
        String tipoTriangulo = equilatero ? "Equilátero" : escaleno ? "Escaleno" : "Isósceles";

        System.out.println(tipoTriangulo);
    }
}
