package ud2.practica;

public class Gominolas {
    public static int totalCaramelos(int iniciales, int necesarios, int regalos) {
        int total = 0;

        if (iniciales < 0 || necesarios < 0 || regalos < 0 || regalos >= necesarios)
            return -1;

        if (necesarios == 0)
            total = iniciales;

        total = iniciales + necesarios + regalos;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(totalCaramelos(25, 5, 1));
        System.out.println(totalCaramelos(100, 10, 2));
        System.out.println(totalCaramelos(20, 2, 5));
    }
}
