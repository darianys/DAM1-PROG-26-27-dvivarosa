package ud1.conversion;
/**
 * @author Darianys Rosales
 */

import java.util.Scanner;

public class CelsiusAFarenheit {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la temperatura en grados Celsius: ");
    double gradosC = sc.nextDouble();
    sc.close();

    double gradosF =  gradosC * 9 / 5 + 32;

    System.out.printf("Esa temperatura en grados Farenheit son: %.2f %n", gradosF);
    //tambien puede ser:
    System.out.print("La temperatura a Farenheit " + String.format("%.1f", gradosF));
}
}
