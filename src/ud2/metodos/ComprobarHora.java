package ud2.metodos;

public class ComprobarHora {

    static boolean compruebaHora(int hora, int minutos, int segundos){
        return (hora <= 23 && minutos <= 59 && segundos <= 59);
    }
    public static void main(String[] args) {
        System.out.println(compruebaHora(23, 15, 60));
        System.out.println(compruebaHora(24, 43, 5));
        System.out.println(compruebaHora(15, 30, 45));
        System.out.println(compruebaHora(1, 4, 0));
    }
}
