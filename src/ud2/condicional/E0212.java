package ud2.condicional;

import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Introduce el día, mes y año (separado por un espacio)");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if(dia >= 1 && dia <= 31 && year <= 2026){
                    //para darle formato a la fecha, investigar mas:
                    System.out.printf("La fecha es correcta: %02d/%02d/%04d%n", dia, mes, year);
                }else{
                    System.out.print("La fecha es incorrecta");
                }
                break;

            case 4,6,9,11:
                if(dia >= 1 && dia <= 30 && year <= 2026){
                    System.out.println("La fecha es correcta %02d/%02d/%04d%n\", dia, mes, year");
                }else{
                    System.out.print("La fecha es incorrecta");
                }
                break;

            case 2:
                if(dia >= 1 && dia <= 28 && year <= 2026){
                    System.out.println("La fecha es correcta %02d/%02d/%04d%n\", dia, mes, year");
                }else{
                    System.out.print("La fecha es incorrecta");
                }   
                break;
            default:
                System.out.print("La fecha no es valida");
        }
    }
}
