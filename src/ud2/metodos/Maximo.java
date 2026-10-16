package ud2.metodos;

/**
 * @author Darianys Rosales
 *         Máximo
 */
public class Maximo {
    public static int maximo(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int maximo(int num1, int num2, int num3) {
        int numMaximo = 0;

        if (num1 > num2 && num1 > num3) {
            numMaximo = num1;
        } else if (num2 > num1 && num2 > num3) {
            numMaximo = num2;
        } else
            numMaximo = num3;

        return numMaximo;
    }

    public static int maximo(int num1, int num2, int num3, int num4) {
        int numMaximo = 0;

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            numMaximo = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            numMaximo = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            numMaximo = num3;
        } else
            numMaximo = num4;

        return numMaximo;
    }

    public static void main(String[] args) {
        System.out.println(maximo(5, 10));
        System.out.println(maximo(5, 2, 9));
        System.out.println(maximo(3, 11, 10, 2));
    }
}
