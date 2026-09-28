package ud1.ejemplos;

public class EjemploCompra2 {
     public static void main(String[] args) {
        final double IVA = 0.21; 

        double precio = 23.5;
        int unidadesCompradas = 5;

        System.out.println("IVA: " + IVA * 100 + "%"); //para mostar mejor el IVA
        System.out.println("Total con IVA: "+ (precio * unidadesCompradas * (1 + IVA)));
        
    }
}
