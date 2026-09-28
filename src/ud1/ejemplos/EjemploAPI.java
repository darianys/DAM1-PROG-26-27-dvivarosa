package ud1.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class EjemploAPI {
    public static void main(String[] args) {

        //Scanner        System.in es la entrada estandar del sistema (teclado)
        Scanner sc = new Scanner(System.in);

        //println: salto de linea
        //print: sin salto de linea

        //printf: permite dar formato, imprime con coma y no con punto a diferencia del printl
        //primero digo el formato y luego el contenido
        //%.2f -> despues del . muestra 2 decimales (numero son los decimales)
        //f -> indica que es un numero tipo float o double
        //%n -> salto de linea
        //se pone una , despues de las comillas y se omite el +

        //o tambien se puede usar el format:
        String decimales = String.format("Numero con dos decimales: %.2f %n", 2.26533);
        System.out.println(decimales);
         
        
        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();  
        
        //chequear el nextLine
        System.out.print("Escriba su nombre: ");
        String nombre = sc.next();
        sc.close();

        System.out.print(nombre + ", Ha escrito: " + numero);

        
        //Para usaralas guiandome por la API
        //El static lo sustituyo por el nombre de la clase .(lo que se vaya usar)
        
        //Clase math
        //así: Math.PI
        //o tambien:
        System.out.println("Valor de PI: " + Math.PI);

        //valor absoluto
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));

        //redondea hacia arriba
        System.out.println("Ceil(): " + Math.ceil(26.4));

        //redondea hacia abajo
        System.out.println("Floor(): " + Math.floor(26.8));

        //redondea
        System.out.println("round(): " + Math.round(26.5));

        //maximo
        System.out.println("max(): " + Math.max(6, 5));

        //minimo
        System.out.println("minimo: " + Math.min(6.4, 6.5));

        //Random
        System.out.println("Random: " + Math.random());

        //Raíz cuadrada
        System.out.println("Raís: " + Math.sqrt(5));

        //elevados
        System.out.println("5 levado a 3 " + Math.pow(5, 3));

        //ejemplos con fecha y hora
        //LocalTime(Hora)
        System.out.println("Hora: " + LocalTime.now());

        //LocalDate(Fecha)
        System.out.println(("Fecha: " + LocalDate.now()));

        //LocalDateTime (Hora y fecha)
        System.out.println("Fceha y hora: " + LocalDateTime.now());

    }
}
