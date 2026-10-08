package ud2.bucles;

import java.util.Scanner;

public class Eco {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introducir número: ");

    //n veces
    int n = sc.nextInt();

    //Decremento
    for (int i = n; i >= 0; i--) {
        System.out.println(i);
    }
    System.out.println("--");
    //Incremento
    for (int i = 0; i <= n; i++) {
        System.out.println(i);
    }
    sc.close();
}
}
