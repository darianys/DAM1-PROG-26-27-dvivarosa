package ud2.metodos;

public class Capicua {
    public static boolean esCapicua(long n) {
        long original = n;
        long invertido = 0;

        if (n < 0) {
            return false;
        }

        while (n > 0) {
            long ultimoDigito = n % 10;
            invertido = (invertido * 10) + ultimoDigito;
            n = n / 10;
        }
        return original == invertido;
    }

    public static void main(String[] args) {
        System.out.println(esCapicua(1551551551));
    }
}
