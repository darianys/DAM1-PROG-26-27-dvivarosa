package ud1.conversion;

import java.util.Scanner;

public class SegundosAHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los segundos para transformar a horas, minutos y segundos: ");
        int segundos = sc.nextInt();

        int minutos = segundos / 3600;
        int hora = minutos % 3600 / 60;
        int segundos2 = segundos % 60;
        System.out.println(hora + ":" + minutos + ":" + segundos2);

        //con printf puedo para mostrar ceros antes, o sea que rellene hacia 
        // la izquierda los ceros que yo le indique: 
        //el d indica decimales de numeros enteros
        System.out.printf("%02d:02%d:02%d", hora, minutos, segundos2);

        sc.close();
    }
}
