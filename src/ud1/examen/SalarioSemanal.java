package ud1.examen;

import java.util.Scanner;

/**
 * @author Darianys Sinayd Vivas Rosales
 * SalarioSemanal
 */

public class SalarioSemanal {
    public static void main(String[] args) {
        final double EUROS_HORA = 12.50;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de horas trabajadas: ");
        int horas = sc.nextInt();
        sc.close();

        int horasExtras =  horas - 40;
        
        //sin horas extras
        double salario = horas * EUROS_HORA;
        
        double salarioHorasExtras =  horasExtras * EUROS_HORA * 2 + ((horas - horasExtras) * EUROS_HORA) ;

        System.out.print((horas <= 40) ? "El salario es de: " + salario : "El salario es de: " + salarioHorasExtras);
    }
}
