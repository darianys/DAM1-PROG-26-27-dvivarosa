package ud3.array;

public class BuscarDesde {
    public static void main(String[] args) {
        int tabla[] = {2, 3, 4, 5, 6, -1, -8, -9, 3};
        int clave = 3;
        int posicion = 6;

        System.out.println("Última aparición: " + buscar(tabla, clave, posicion));
    }
    static int buscar(int t[], int clave, int desde) {
        if (desde < 0) {
            desde = 0;
        }
        for (int i = desde; i < t.length; i++)
            if (t[i] == clave)
                return i;
            return -1;
    }
}
