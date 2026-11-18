package ud3.array;

public class MontanaRusa {
    public static void main(String[] args) {
        int tabla[] = { 4, 10, 3, 2 };
        System.out.println(contarPicos(tabla));
    }

    public static int contarPicos(int[] alturas) {
        int picos = 0;
        int primero = 0;
        int ultimo = 0;
        int siguienteB = 0;
        int anterior = 0;
        int siguiente = 0;

        for (int i = 0; i < (alturas.length / alturas.length); i++) {
            primero = alturas[i];
        }
        for (int i = alturas.length - 1; i > alturas.length - 2; i--) {
            ultimo = alturas[i];
        }

        for (int i = 0; i < alturas.length; i++) {
            siguiente = alturas[i];

            if (siguiente > anterior && siguiente > siguienteB) {
                picos++;
            }

            anterior = siguiente;
            siguienteB = alturas[i + 1];
        }

        if (primero > ultimo || ultimo > primero && ultimo != siguiente) {
            picos++;
        }
        return picos;
    }
}
