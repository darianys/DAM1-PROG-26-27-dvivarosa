package ud3.array;

public class Indice {
    public static void main(String[] args) {
        int tabla[] = {7, 26, 9, 12, 22};

        //Muestro el indice de los números pares
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
