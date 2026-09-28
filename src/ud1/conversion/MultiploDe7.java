package ud1.conversion;

import java.util.Scanner;

public class MultiploDe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(num % 7 == 0 ? "No hay que sumarle nada" : num);
    }
}
