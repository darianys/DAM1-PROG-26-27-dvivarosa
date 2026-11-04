package ud2.practica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeguridadBanco {
    public static void main(String[] args) {
        System.out.println("Introducir código: ");
        leerCodigo();
    }

    public static int leerCodigo() throws IllegalArgumentException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        sc.close();

        return  codigo;
    }
}
