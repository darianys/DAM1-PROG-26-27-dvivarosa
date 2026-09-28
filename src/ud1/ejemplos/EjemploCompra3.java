package ud1.ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * @author Darianys Rosales
 * EjemploCompra3
 */
public class EjemploCompra3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Numero de unidades: ");
        int unidades = sc.nextInt();
        
        double totalImporte = precio * unidades;

        System.out.printf("Importe: %.2f %n", totalImporte);
        System.out.println("Fecha de compra: " + LocalDate.now());
        System.out.println("Hora de compra: " + LocalTime.now());

        sc.close();
    }
}
