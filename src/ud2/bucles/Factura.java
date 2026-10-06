package ud2.bucles;

import java.util.Scanner;
/**
 * @author Darianys Sinayd Vivas Rosales 
 * Factura
 */

public class Factura {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce las unidades a comprar: ");
        int unidades = sc.nextInt();
        sc.close();

            //también puede ser (1 + IVA)
            //y el valor de IVA lo pongo como 0,21
        double precioFinal = (precio * unidades) * (1 + IVA);
        System.out.println("------------------------------------");

        if (precioFinal > 100) {
            System.out.println("Se aplicará un 5% de descuento");
            System.out.printf("Precio final con descuento: %.2f \n", precioFinal - (precioFinal * DESCUENTO));
        }
        System.out.printf("Precio sin descuento: %.2f", precioFinal);
    }
}
