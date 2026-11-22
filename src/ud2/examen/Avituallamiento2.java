package ud2.examen;

import java.util.Scanner;

public class Avituallamiento2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir la altura sobre el nivel del mar: ");
        int altura = sc.nextInt();
        int alturaIgual = altura;
        int alturaDistinta = 0;
        int contIgual = 0;
        int contDistinta = 0;
        int pk = 0;


        while (altura != -1) {
            if (altura == alturaIgual) {
                alturaIgual = altura;
                contIgual ++;
            }else if (alturaIgual != altura) {
                alturaDistinta = altura;
                contDistinta ++;
            }

            altura = sc.nextInt();
        }
        sc.close();
        
        if (contIgual > contDistinta) {
            System.out.println(contIgual -1);
        }else{
            System.out.println(contDistinta -1);
        }
    }
}
