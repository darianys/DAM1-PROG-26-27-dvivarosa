package ud2.bucles;

import java.util.Scanner;

public class EdadMaximaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        int edadMax = 0;
        int edadMin = 0;

        while (edad != -1) {
            if(edad > edadMax){
                edadMax = edad;
            }
            if (edad < edadMax) {
                edadMin = edad; 
            }
            System.out.println("Introduce la edad: ");
            edad = sc.nextInt();
        }
        System.out.println("Edad máxima: " + edadMax);
        System.out.println("Edad mínima es: " + edadMin);
        sc.close();
    }
}
