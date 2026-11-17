package ud3.array;

public class BuscarUltimo {
    public static void main(String[] args) {
        int tabla[] = {2, 3, 4, 5, 6, -1, -8, -9, 3};
        int clave = 3;

        System.out.println("Última aparición: " + buscar(tabla, clave));
    }

    static int buscar(int t[], int clave) {
        for (int i = t.length - 1; i >= 0; i--)
            if (t[i] == clave)
                return i;
        return -1;
    }

}
