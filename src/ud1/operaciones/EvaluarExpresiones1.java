package ud1.operaciones;

public class EvaluarExpresiones1 {
    public static void main(String[] args) {
        double a = 8., b = 3, c = 5; 
        
        //primero lo hice así pero es mejor sacarlo directamente en el sout
        /*
        double exp1 = a + b + c; 
        double exp2 = 2 * b + 3 * (a - c); 
        double exp3 = a / b; 
        double exp4 = a % b; 
        double exp5 = a / c; 
        double exp6 = a % c;
         */

        System.out.println(a + b + c);
        System.out.println(2 * b + 3 * (a - c));
        System.out.printf("%.2f %n",a / b);
        System.out.println(a % b);
        System.out.println(a / c);
        System.out.println(a % c);
    }
}
