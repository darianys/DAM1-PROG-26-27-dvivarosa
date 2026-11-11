package ud3.array;

public class Referencias {
    public static void main(String[] args) {
     int tabla[] = {5, 30, 15, 10, 25, 50, 35, 0, 20, 40};
        int tabla2[] = tabla;
        int tabla3[] = tabla2;   

        System.out.println(tabla);
        System.out.println(tabla2);
        System.out.println(tabla3);
    }
}
