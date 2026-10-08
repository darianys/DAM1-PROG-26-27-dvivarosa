package ud2.bucles;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número (0 para terminar)");
        int num = sc.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Es par");
            }
            if (num >= 0) {
                System.out.println("Es positivo");
            }
            System.out.println("Su cuadrado " + Math.powExact(num, 2));
            System.out.println("Introducir número: ");
            num = sc.nextInt();
        }
        sc.close();
    }
}
