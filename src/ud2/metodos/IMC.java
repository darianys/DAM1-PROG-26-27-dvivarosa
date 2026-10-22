package ud2.metodos;

import java.util.Scanner;

public class IMC {
    static double imc(double kg, double cm){
        return kg / Math.pow(cm, 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir el peso (kg)");
        double kg = sc.nextDouble();

        System.out.println("Introducir la altura (cm)");
        double cm = sc.nextDouble();
        sc.close(); 

        if (kg >= 20 && kg <= 300 && cm >= 50 && cm <= 250) {
            
        }
    }
}
