package ud2.condicional;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la hora (formato de 24 horas), los minutos y los segundos (separados por un espacio): \n");
        int hora = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        sc.close();

        if(segundos >= 59){
            segundos = 0;
            minutos ++;
        
            if (minutos >= 59) {
                minutos = 0;
                hora ++; 
        

                if (hora == 24) {
                    hora = 0;
                } 
            }
        } 

        System.out.println(hora);
        System.out.println(minutos);
        System.out.println(segundos);
        }
}
