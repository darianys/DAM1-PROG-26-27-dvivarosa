package ud2.bucles;

public class EjemploSwitch {
    public static void main(String[] args) {
        int posicion = 3;
        
        switch (posicion) {
            case 1:
                System.out.println("Medalla de oro");
                break;
            case 2:
                System.out.println("Medalla de plata");
                break;
            case 3:
                System.out.println("Medalla de bronce");
                break;
            default:
                System.out.println("No hay podio");;
        }
        System.out.println("Fin del programa");
    }
}
