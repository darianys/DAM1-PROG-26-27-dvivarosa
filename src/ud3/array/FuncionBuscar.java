package ud3.array;

public class FuncionBuscar {
    public static void main(String[] args) {
        int tabla[] = {3, 4, 5, 6, -3};
        int clave = 5;

        int posicion = buscar(tabla, clave);

        System.out.println(posicion);
    }
    public static int buscar(int t[], int clave){
        int posicion = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                posicion = i;
                return posicion;
            }
        }
        return -1;
    }
}
