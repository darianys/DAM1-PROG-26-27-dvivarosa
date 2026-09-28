package ud1.conversion;
/**
 * @author Darianys Rosales
 */

import java.util.Scanner;
public class Par {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            sc.close();

            boolean par = num % 2 == 0 ; 
            System.out.println(par);  
    }
}
