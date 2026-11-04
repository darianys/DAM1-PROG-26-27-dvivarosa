package ud2.practica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeguridadBanco {
    public static void main(String[] args) {
        System.out.println("Introducir código: ");
        Scanner sc = new Scanner(System.in);
        int codigo = 0;

        try {
            codigo = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: no puede contener caracteres");
        }catch(IllegalArgumentException e){
            System.out.println("ERROR: el codigo contiene digitos de más!");
        }
        sc.close();
        codigoSeguro(codigo);
    }

    public static int codigoSeguro(int cod){
        int codSuma = 0;
        int cod2 = 0;
        cod2 = cod / 1000;
        codSuma = codSuma +  cod ;

        cod = cod2 / 100 % 10;
        codSuma = codSuma + cod;

        return cod;
    }
}


