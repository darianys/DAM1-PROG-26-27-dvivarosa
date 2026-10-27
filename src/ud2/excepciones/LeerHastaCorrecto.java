package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0; // inicializo
        boolean lecturaCorrecta = false; // metodo bandera
        System.out.println("Introducir número: ");

        //como funcionaría con un if (alternativa sin entrar a excepciones)
        if (sc.hasNextInt()) {
            System.out.println("Es un entero");
            n = sc.nextInt();
        } else{
            System.out.println("No es un entero");
            sc.next();
        }

        //puedo tratar así la excepción 
        // utilizo un do
        do {
            try {
                n = sc.nextInt(); // utilizo la variable
            } catch (InputMismatchException e) {
                System.out.println("Solo introducir números");
                sc.nextLine(); // limpio o con next()
            }
        } while (!lecturaCorrecta); // hago que se repita hasta true

        System.out.println("Número introducido: " + n);
        sc.close();
    }
}
