package ud2.bucles;

import java.util.Scanner;

public class EdadMaximaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        int edadMax = edad;
        int edadMin = edad;

        while (edad != -1) {
            //otra forma de hacerlo
                //edadMax = Math.max(edad, edadMax);
                //edadMin = Math.min(edad, edadMin);
            if(edad > edadMax){
                edadMax = Math.max(edad, edadMin);
            }
            if (edad < edadMax) {
                edadMin = edad; 
            }
            
            System.out.println("Introduce la edad: ");
            edad = sc.nextInt();
        }
        System.out.println("Edad máxima: " + edadMax);
        System.out.println("Edad mínima: " + edadMin);
        sc.close();
    }
}
