package ud2.bucles;

import java.util.Scanner;

public class E0210_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota erronea");;
        }
    }
}
