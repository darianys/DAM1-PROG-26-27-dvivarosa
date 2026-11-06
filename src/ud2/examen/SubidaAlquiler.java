package ud2.examen;

import java.util.Scanner;

public class SubidaAlquiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir renta actual: ");
        double renta = sc.nextDouble();

        System.out.println("Introducir precio de referencia: ");
        double referencia = sc.nextDouble();
        sc.close();

        double total = subidaAlquiler(renta, referencia);
        double totalRenta = total + renta;

        System.out.println("El importe es " + subidaAlquiler(renta, referencia) + ". El total del alquiler será " + totalRenta);
    }

    public static double subidaAlquiler(double rentaActual, double precioMaximoReferencia) {
        double importe = 0;
        double total = 0;

        if (rentaActual >= precioMaximoReferencia) {
            return 0;
        } else {
            importe = rentaActual * 0.02;

            total = importe + rentaActual;

            if (total > precioMaximoReferencia) {
                importe = precioMaximoReferencia - rentaActual;
            }
        }
        return importe;
    }
}
