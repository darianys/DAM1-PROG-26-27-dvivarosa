package ud2.condicional;

import java.util.Scanner;
//ejercicio sin hacer
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num  = sc.nextInt();
        sc.close();

        if (num > 5) {
             System.out.println("Numero mayor que 5");
        }
    }
}
