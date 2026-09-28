package ud1.conversion;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = sc.nextLine().charAt(0);

        System.out.println(letra);
        sc.close();
    }
// para que solo me de una letra el escaner:_
//sc.nextLine().charAt() -> esto lo que hace es que se queda con 
//la primer letra de lo que escriba.
//nextLine -> lee toda la linea 
//charAt -> agarra la primer letra  
}
