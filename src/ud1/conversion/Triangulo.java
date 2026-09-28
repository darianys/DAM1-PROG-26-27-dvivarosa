package ud1.conversion;
/**
 * @author Darianys Rosales
 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base y altura: ");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        sc.close();

        double area = base * altura / 2;
        System.out.printf("%.2f %n", area);
    }
}
