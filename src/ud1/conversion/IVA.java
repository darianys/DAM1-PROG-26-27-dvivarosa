package ud1.conversion;

import java.util.Scanner;

/**
 * @author Darianys Rosales
 * IVA
 */
public class IVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double iva = sc.nextDouble();
        double baseImponible = sc.nextDouble();

        System.out.println("Calculo total: " + baseImponible * iva);
        sc.close();
    }
}
