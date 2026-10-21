package ud2.metodos;

import java.util.Scanner;

public class NumeroALetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir un numero entre 1 y 99: ");
        int num = sc.nextInt();
        sc.close();

        String numEscrito = switch (num) {
            case 1 -> "Uno";
            case 2 -> "Dos";
            case 3 -> "Tres";
            case 4 -> "Cuatro";
            case 5 -> "Cinco";
            case 6 -> "Séis";
            case 7 -> "Siete";
            case 8 -> "Ocho";
            case 9 -> "Nueve";
            case 10 -> "Diez";
            case 11 -> "Once";
            case 12 -> "Doce";
            case 13 -> "Trece";
            case 14 -> "Catorce";
            case 15 -> "Quince";
            case 16 -> "Dieciséis";
            case 17 -> "Diecisiete";
            case 18 -> "Dieciocho";
            case 19 -> "Diecinueve";
            case 20 -> "Veinte";
            case 21 -> "Veintiuno";
            case 22 -> "Veintidós";
            case 23 -> "Veintitrés";
            case 24 -> "Veinticuatro";
            case 25 -> "Veinticinco";
            case 26 -> "Veintiséis";
            case 27 -> "Veintisiete";
            case 28 -> "Venitiocho";
            case 29 -> "Veintinueve";
            case 30 -> "Treinta";
            case 31 -> "Treinta y uno";
            case 32 -> "Treinta y dos";
            case 33 -> "Treinta y tres";
            case 34 -> "Treinta y cuatro";
            case 35 -> "Treinta y cinco";
            case 36 -> "Treinta y séis";
            case 37 -> "Treinta y siete";
            case 38 -> "Treinta y ocho";
            case 39 -> "Treinta y nueve";
            case 40 -> "Cuarenta";
            case 41 -> "Cuarenta y uno";
            case 42 -> "Cuarenta y dos";
            case 43 -> "Cuarenta y tres";
            case 44 -> "Cuarenta y cuatro";
            case 45 -> "Cuarenta y cinco";
            case 46 -> "Cuarenta y séis";
            case 47 -> "Cuarenta y siete";
            case 48 -> "Cuarenta y ocho";
            case 49 -> "Cuarenta y nueve";
            case 50 -> "Cincuenta";
            case 51 -> "Cincuenta y uno";
            case 52 -> "Cincuenta y dos";
            case 53 -> "Cincuenta y tres";
            case 54 -> "Cincuenta y cuatro";
            case 55 -> "Cincuenta y cinco";
            case 56 -> "Cincuenta y séis";
            case 57 -> "Cincuenta y siete";
            case 58 -> "Cincuenta y ocho";
            case 59 -> "Cincuenta y nueve";
            
                
        
            default -> "Número invalido";
            
        };
        System.out.println(numEscrito);
        
    }
}
