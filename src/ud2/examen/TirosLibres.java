package ud2.examen;

import java.util.Scanner;

public class TirosLibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir (1) para tiro anotado y (0) para tiro fallado");
        int tiro = sc.nextInt();
        boolean stop = false;
        int tiroAnotado = 0;
        int tiroFallado = 0;
        int lanzados = 0;

        while (stop == false) {
            
            if (tiroFallado >= 3 || lanzados >= 20) {
                stop = true;
            }

            if (tiro == 1) {
                tiroAnotado++;
            } else {
                tiroFallado++;
            }

            lanzados++;

            tiro = sc.nextInt();
        }
        sc.close();

        double porcentaje = (double) tiroAnotado / lanzados * 100;

        if (porcentaje <= 70) {
            System.out.printf("%d lanzamientos, %d anotados, %.2f%%, NO supera 70%%.%n", lanzados, tiroAnotado, porcentaje);
        } else {
            System.out.println(lanzados + " lanzamientos, " + tiroAnotado + " anotado, " + porcentaje + ", NO supera 70%");
        }

    }
}
