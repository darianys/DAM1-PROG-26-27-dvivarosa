package ud2.bucles;

public class EjemplosFor {
    static int num = 3;

    public static int num(int n){
        n = 2 + num;
        return n;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j);
            }
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i);
            }
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
            for (int j = 5; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
