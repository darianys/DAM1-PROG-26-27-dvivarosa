package ud2.bucles;

import java.util.Scanner;

public class EstadisticaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir edad (número negativo para terminar): ");
        int edad = sc.nextInt();
        int mayores = 0;
        int contador = 0;
        int suma = 0;
        int media = 0;

        while (edad > 0) {
            contador ++;
            if (edad >= 18) {
                mayores ++;
            }
            suma += edad;
            media = suma / contador;

            System.out.println("Introducir edad: ");
            edad = sc.nextInt();
        }
        System.out.println("Suma de todas las edades: " + suma);
        System.out.println("Media de edad: " + media);
        System.out.println("Número de alumnos: " + contador);
        System.out.println("Alumnos mayores de edad: " + mayores);
        sc.close();
    }
}
