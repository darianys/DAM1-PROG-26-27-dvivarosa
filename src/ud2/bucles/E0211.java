package ud2.bucles;

import java.util.Scanner;

public class E0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7 correspondiente a un día de la semana: ");
        int semana = sc.nextInt();
        sc.close();

        switch (semana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("No hay un dia de la semana comprendido entre ese número");;
        }
    }
}
