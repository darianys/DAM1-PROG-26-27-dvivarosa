package ud2.metodos;

public class Digitos {
    public static void digitos(int n) {
        int ultimoDigito = 0;

        if (n == 0) {
            System.out.println(0);
        }
        while (n > 0) {
            ultimoDigito = n % 10;
            System.out.println(ultimoDigito);
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        digitos(17263);
    }
}
