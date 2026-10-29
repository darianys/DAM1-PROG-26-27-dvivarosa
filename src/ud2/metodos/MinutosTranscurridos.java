package ud2.metodos;

public class MinutosTranscurridos {
    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){

        int minutos = minuto2 - minuto1;
        if (minuto1 > minuto2) {
            minutos= minuto1 - minuto2;
            hora2 = hora2 - 1;
        }

        int horas = hora1 > hora2 ? (hora1 * 60) - (hora2 * 60) : (hora2 * 60) - (hora1 * 60);
        int minTranscurridos = horas + minutos;

        if (hora1 > 23 || hora2 > 23 || minuto1 > 59 || minuto2 > 59) {
            minTranscurridos = -1;
        }

        return minTranscurridos;
    }
    public static void main(String[] args) {
        System.out.println(diferenciaMin(13,10,10,20));
    }
}
