package ud3.array;

public class MontanaRusa2 {
    public static void main(String[] args) {
        int alturasB[] = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };

        System.out.println(contarPicos(alturasB));
    }

    public static int contarPicos(int[] alturas) {
        int picos = 0;
        int n = alturas.length;

        for (int i = 0; i < alturas.length; i++) {
            int anterior = alturas[(i - 1 + n) % n];
            int siguiente = alturas[(i + 1) % n];

            if (alturas[i] > anterior && alturas[i] > siguiente) {
                picos++;
            }

        }
        return picos;
    }
}
