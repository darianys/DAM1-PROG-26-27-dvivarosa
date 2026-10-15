package ud2.bucles;

import java.util.Scanner;

public class EstadisticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir las notas: ");
        int nota = sc.nextInt();

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        while (nota != -1) {
            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
            nota = sc.nextInt();
        }
        sc.close();

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos suspensos: " + suspensos);
    }
}
