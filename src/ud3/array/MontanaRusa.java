package ud3.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MontanaRusa {
    public static void main(String[] args) {
        int alturasB[] = {  1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1  };

        System.out.println(contarPicos(alturasB));
    }

    public static int contarPicos(int[] alturas) {
        int picos = 0;
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        int mayorB = 0;
        int menorB = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] <= menor) {
                menor = alturas[i];
            }
            if (alturas[i] > mayor) {
                mayor = alturas[i];
            }

            if (mayor > menor && mayorB > mayor) {
                picos++;
            }

            mayorB = mayor;
            mayor = Integer.MIN_VALUE;
        }

        return picos;
    }

    @Test
    void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
    }

    @Test
    void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
    }

}
