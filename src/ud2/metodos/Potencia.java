package ud2.metodos;

public class Potencia {
    // chequear si realmente cada una es lo que deberia

    // interactiva
    public static int potencia(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * Math.powExact(b, (e - 1));
    }

    // recursiva
    public static int potenciaR(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * potenciaR(b, --e);
    }

    public static void main(String[] args) {
        System.out.println(potencia(9, 5));
        System.out.println(potenciaR(9, 5));
    }
}
