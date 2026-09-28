package ud1.conversion;
/**
 * @author Darianys Rosales
 */
import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores de x1, x2, y1, y2");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("La distancia entre dos puntos es: %.2f %n", d);
    }
}
