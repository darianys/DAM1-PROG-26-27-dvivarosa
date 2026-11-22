package ud2.examen;

import java.util.Scanner;

public class TirosLibres2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un 1 para los tiros anotados y un 0 para los tiros fallados: ");
        int tiro = sc.nextInt();
        int fallos = 0;
        int tirosAnotados = 0;
        int tirosTotal = 0;
        double porcentaje = 0;
        boolean stop = false;

        while (stop == false) {
            if (tiro == 0) {
                fallos++;
                if (fallos >= 3) {
                    stop = true;
                }
            } else if (tiro == 1) {
                tirosAnotados++;
            }

            tirosTotal++;
            if (tirosTotal >= 20) {
                stop = true;
            }

            tiro = sc.nextInt();
        }
        sc.close();

        double tirosAnotados2 = tirosAnotados / 10;
        porcentaje = (100 * tirosAnotados2 / (tirosTotal * 10)) * 100;

        if (porcentaje >= 70) {
            System.out.println(
                    tirosTotal + " lanzamientos, " + tirosAnotados + " anotados, " + porcentaje + "%, Supera 70%");
        } else
            System.out.println(
                    tirosTotal + " lanzamientos, " + tirosAnotados + " anotados, " + porcentaje + "%, NO supera 70%");
    }
}
