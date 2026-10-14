package ud2.bucles;

import java.util.Scanner;

public class Suspensos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir notas: ");
        double nota = sc.nextDouble();

        int contSuspensos = 0;

        while (nota != -1) {
            if (nota < 5) {
                contSuspensos ++;
            }
            nota = sc.nextDouble();
        }
        sc.close();

        System.out.println("Hubieron " + contSuspensos + " suspensos");
    }
}
