package ud2.bucles;

import java.util.Random;

public class SumarImapres {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(1, 50 + 1);

        int cont = 10;
        int suma = 0;

        while (cont > 0) {
            if (num % 2 != 0) {
                suma = num + suma;
                cont --;
            }
            num = rnd.nextInt(1, 50 + 1); 
        }
        System.out.println(suma);
    }
}
