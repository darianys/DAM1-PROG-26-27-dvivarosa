package ud2.bucles;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int num = rnd.nextInt(1, 150 + 1);

        int operando1 = sc.nextInt();
        int operacion = generarOperacione(operando1);
    }

    public static int generarOperacione(int operando1) {
        int resultado = 0;
        Random rnd = new Random();
        int operacionRandom = rnd.nextInt(1, 3 + 1);
        int operando2 = rnd.nextInt(1, 199 + 1);

            do{
            if (operacionRandom == 1) {
                resultado = operando1 + operando2;
            } else if (operacionRandom == 2) {
                resultado = operando1 - operando2;
            } else if (operacionRandom == 3) {
                resultado = operando1 * operando2;
            } else {
                resultado = operando1 / operando2;
            }
            }while(resultado > 200);
            
        return resultado;
    }
}
/*  */