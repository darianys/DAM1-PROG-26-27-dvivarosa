package ud2.util;

public class Util {
    public static boolean esPar(int num) {
        return (num % 2 == 0);
    }

    public static boolean esCasiCero(double num) {
        return (num < 0 && num > -1 && num != 0);
    }

    // public static boolean esBisiesto(int año){
    // return;
    // }

    public static int notaEnTexto(int nota) {
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota erronea");
                ;
        }
        return nota;
    }

    public static int diaSemana(int semana) {
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
                System.out.println("No hay un dia de la semana comprendido entre ese número");
                ;
        }
        return semana;
    }

    public static int esFechaCorrecta(int dia, int mes, int year) {

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia >= 1 && dia <= 31 && year <= 2026) {
                    // para darle formato a la fecha, investigar mas:
                    System.out.printf("La fecha es correcta: %02d/%02d/%04d%n", dia, mes, year);
                } else {
                    System.out.print("La fecha es incorrecta");
                }
                break;

            case 4, 6, 9, 11:
                if (dia >= 1 && dia <= 30 && year <= 2026) {
                    System.out.println("La fecha es correcta %02d/%02d/%04d%n\", dia, mes, year");
                } else {
                    System.out.print("La fecha es incorrecta");
                }
                break;

            case 2:
                if (dia >= 1 && dia <= 28 && year <= 2026) {
                    System.out.println("La fecha es correcta %02d/%02d/%04d%n\", dia, mes, year");
                } else {
                    System.out.print("La fecha es incorrecta");
                }
                break;
            default:
                System.out.print("La fecha no es valida");
        }
        return mes;
    }

    public static void main(String[] args) {
        System.out.println(notaEnTexto(5));
        System.out.println(diaSemana(3));
    }
}
