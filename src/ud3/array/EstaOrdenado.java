package ud3.array;

public class EstaOrdenado {
    public static void main(String[] args) {
        int t[] = {2, 5, 4};

        System.out.println((estaOrdenado(t)));
    }
    
    static boolean estaOrdenado(int[] t){
        if (t.length < 2)
            return true;

        for (int i = 1; i < t.length; i++) {
            if (t[i-1] > t[i])
                return false;
            }
        return true;
    }
}
