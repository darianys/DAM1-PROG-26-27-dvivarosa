package ud2.bucles;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir precio del precio: ");
        int precio = sc.nextInt();

        System.out.println("Introducir la cantidad de productos: ");
        int cantidad = sc.nextInt();

        while (precio <= 0 && cantidad <= 0) {
            System.out.println("Introducir precio del precio (-1 para terminar): ");
            precio = sc.nextInt();

            System.out.println("Introducir la cantidad de productos: ");
            cantidad = sc.nextInt();

            double total = precio * cantidad;
            System.out.printf("Importe total es de: %.2f" + total);
            System.out.printf("El pago se realizará con tarjeta o con efectivo? \n (1 con tarjeta y 2 con efectivo)");

            int metodoPago = sc.nextInt();

            System.out.println("Introducir pago: ");
            double pagoCliente = sc.nextInt();

            double devuelto = 0;

            final int CIEN = 100;
            final int CINCUENTA = 50;
            final int VEINTE = 20;
            final int DIEZ = 10;
            final int CINCO = 5;
            final int DOS = 2;
            final int UNO = 1;
            final double CENTAVO_CINCUENTA = 0.5;
            final double CENTAVO_VEINTE = 0.2;
            final double CENTAVO_DIEZ = 0.1;
            final double CENTAVO_CINCO = 0.05;
            final double CENTAVO_DOS = 0.02;
            final double CENTAVO_UNO = 0.01;

            double decena = devuelto / 100;
            double centena = devuelto / 10;
            double unidad = devuelto % 10;
            double decimales = devuelto / 1000;

            if (metodoPago == 2) {
                devuelto = pagoCliente - total;
                if (decena == 0) {

                }
            }

        }

    }
}
