package ud2.bucles;

import java.util.Scanner;

public class ArbolMasAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introducir la altura del árbol (en centímetros): ");
        double alturaArbol = sc.nextDouble();

        System.out.print("Introducir la identificación del árbol: ");
        String identArbol = sc.nextLine();

        double alturaMayor = 0;
        String etiqueta = "";

        //isEmpty : metodo que se puede usar en cadena, devuelve true si esta vacio
        while (!identArbol.isEmpty() && alturaArbol != -1) {
            if (alturaArbol > alturaMayor) {
                alturaMayor = alturaArbol;
            }
            alturaArbol = sc.nextDouble();
        }
        System.out.printf("el arbol más alto mide %.2f ", alturaMayor);
        sc.close();
    }
}
