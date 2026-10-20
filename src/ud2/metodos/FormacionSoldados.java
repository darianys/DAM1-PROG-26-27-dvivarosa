package ud2.metodos;

import java.util.Scanner;

public class FormacionSoldados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de soldados: ");
        int soldados = sc.nextInt();
        sc.close();

        for (int i = 1; i <= soldados; i++) {

            for (int j = 0; j < soldados / 2; j++) {
                System.out.print("*");
            }

            System.out.println();

            for (int j = 0; j < i / 2; j++) {
                System.out.print("*");
            }
        }
    }
}
