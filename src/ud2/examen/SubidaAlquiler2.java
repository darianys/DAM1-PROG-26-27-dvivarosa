package ud2.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubidaAlquiler2 {
    public static double subidaAlquiler(double rentaActual, double precioMaximoReferencia) {
        double aumento = 0;

        if (rentaActual < 0 || precioMaximoReferencia < 0) {
            return 0;
        } else {
            aumento = rentaActual * 0.2;
        }
        return aumento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el precio del alquiler actual y el precio de referencia: ");
        double renta = 0;
        double referencia = 0;

        try {
            renta = sc.nextDouble();
            referencia = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: no puede introducir carácteres");
        }
        sc.close();

        double totalRenta = subidaAlquiler(renta, referencia) + renta;
        if (renta > referencia) {
            System.out.println("No subirá el importe del alquiler ni la renta");
        } else {
            System.out.println("El importe subirá: " + subidaAlquiler(renta, referencia)
                    + ", y el total de la nueva renta será " + totalRenta);
        }
    }
    
}