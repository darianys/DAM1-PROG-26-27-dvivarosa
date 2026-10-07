package ud2.condicional;

import java.util.Scanner;

public class E0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7 correspondiente a un día de la semana: ");
        int semana = sc.nextInt();
        sc.close();

        /*
        también puede ser haciendo un String vacio:
        String dia = ""; (lo dejo vacido y le doy el valor en el switch)
        switch(semana){
            case 1:
                dia = "Lunes"; (de esta forma el String segun el caso pasa a ser lo que se le asigne)
                break; (en este caso String dia = Lunes)
        }

        o con el yield
        switch(semana){
        case 1 ->{
        yield "Lunes";        
        }
        }
        */
        switch (semana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No hay un dia de la semana comprendido entre ese número");;
        }
    }
}
