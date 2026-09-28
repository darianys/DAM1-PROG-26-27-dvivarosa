package ud1.ejemplos;
/**
 * @author Darianys Sinayd Vivas Rosales
 * EjemploCompra
 */

public class EjemploCompra {
    public static void main(String[] args) {
        final double IVA = 0.21; 

        double precio = 23.5;
        int unidadesCompradas = 5;
        
        System.out.println("Total: "+ (precio * unidadesCompradas * (1 + IVA)));
    }
}
