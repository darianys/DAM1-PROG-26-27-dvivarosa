package ud1.operaciones;

import java.util.Scanner;
/**
 * @author Darianys Rosales
 * Circulo
 */
public class Circulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio de un circulo: ");
        double r = sc.nextDouble();
        sc.close();
        
        double p = 2. * Math.PI * r;
        double a = Math.PI * Math.pow(r, 2.);

        System.out.printf("El perimetro es de: %.2f %n", p);
        System.out.printf("El area es de: %.2f", a);
    }
}
