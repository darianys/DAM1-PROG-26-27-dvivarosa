package ud2.metodos;

public class Primo {
    public static boolean esPrimo(int n) {
        // es numero primo si se puede dividir por si mismo y 1
        // se debe ser un bucle para buscar por donde se puede dividir
        // se recorren todos los numeros de 1 en adelante hasta el propio n - 1
        // si hay un divisor mas no es primo
        // puedo usar la bandera para terminarlo: boolean false y en cuanto sea true
        // tranca

        // corregir
        if (n == 1 || n % n == 0 && n % 2 != 0) {
            return true;
        }
        return false;
    }
}
