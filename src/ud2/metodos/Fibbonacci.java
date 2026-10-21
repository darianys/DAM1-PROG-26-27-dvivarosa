package ud2.metodos;

public class Fibbonacci {
    public static int fibbonacci( int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibbonacci(n - 1) + fibbonacci(n -2);
    }
    public static void main(String[] args) {
        //esto lo hicieron en clases, chequearlo
        //por qué el for?
        int n = 13;
        for (int i = 0; i < n; i++) {
           System.out.println(fibbonacci(i) + " "); 
        }
        
    }
}
