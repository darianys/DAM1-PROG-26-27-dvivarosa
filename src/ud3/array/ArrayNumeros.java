package ud3.array;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir 5 números: ");

        int[] tabla = new int[5];

        int positivo = 0;
        int negativo = 0;
        int sumaPositivo = 0;
        int sumaNegativo = 0;
        int cero = 0;

        for (int i = 0; i < tabla.length; i++) {
            int num = sc.nextInt();
            tabla[i] = num;

            if (num > 0) {
                positivo ++;
                sumaPositivo += num;
            } else if (num == 0) {
                cero ++;
            } else {
                negativo ++;
                sumaNegativo += num;
            }

        }
        sc.close();

        double mediaPositivo = (double) sumaPositivo / positivo ;
        double mediaNegativo = (double) sumaNegativo / negativo;

        System.out.println(mediaPositivo);
        System.out.println(mediaNegativo);
        System.out.println(cero);
    }
}
