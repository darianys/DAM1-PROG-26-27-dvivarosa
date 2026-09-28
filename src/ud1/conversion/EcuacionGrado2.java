package ud1.conversion;

public class EcuacionGrado2 {
    public static void main(String[] args) {
        double a = 2.3, b = 4.6, c = 7.2;

        double x = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a;
        System.out.printf("El valor de x es: %.2f %n", x);
    }
}
