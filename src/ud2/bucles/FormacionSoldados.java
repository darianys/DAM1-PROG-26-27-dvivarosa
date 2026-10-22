package ud2.bucles;

import java.util.Scanner;

public class FormacionSoldados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de soldados: ");
        int soldados = sc.nextInt();
        sc.close();

        System.out.println("Formación cuadrada: ");
        if (soldados > 0) {

            for (int i = 1; i < soldados / 2; i++) {

                for (int j = 0; j < soldados / 2 - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();

                for (int j = 0; j > i; j--) {
                    System.out.print("*");
                }
            }
        }
    }
}
