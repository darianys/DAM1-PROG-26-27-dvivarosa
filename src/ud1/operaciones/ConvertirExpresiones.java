package ud1.operaciones;

import java.util.Scanner;

/**
 * @author Drainys Rosales
 * ConvertirExpresiones
 */

public class ConvertirExpresiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //debo ponerle punto para que me de las decimales
        double a = 3. / 2 + 4. / 3;
        System.out.printf("El resultado de la operacion a es: %.2f %n", a);
        
        System.out.println("valor de X y Y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double b = 1 / x - 5 - 3 * x * y / 4;

        System.out.printf("El resultado de la operacion b es: %.2f", b);
        
        sc.close();
    }
}
