package ud2.metodos;

public class Triangulo {
    public static void triangulo(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangulo(10);
    }
}
