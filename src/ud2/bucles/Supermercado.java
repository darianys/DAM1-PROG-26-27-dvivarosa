package ud2.bucles;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir precio del precio: ");
        int precio = sc.nextInt();

        System.out.println("Introducir la cantidad de productos: ");
        int cantidad = sc.nextInt();

        while (precio > 0) {
            System.out.println("Introducir precio del precio (-1 para terminar): ");
            precio = sc.nextInt();

            System.out.println("Introducir la cantidad de productos: ");
            cantidad = sc.nextInt();

        }
        
    }
}
