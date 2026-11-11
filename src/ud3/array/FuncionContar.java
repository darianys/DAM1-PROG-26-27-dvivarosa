package ud3.array;

public class FuncionContar {
    public static void main(String[] args) {
        int tabla[] = {3, 4, 5, 6, 3 };
        int clave = 3;

        int veces = contar(tabla, clave);

        System.out.println(veces > 1 ? "La clave se ha repetido: " + veces + " veces" : "La clave se ha repetido: " + veces + " vez");
    }

    static int contar(int t[], int clave) {
        int valor = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                valor++;
            }
        }
        return valor;
    }
}
