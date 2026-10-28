package ud2.metodos;

public class MinutosTranscurridos {
    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){
        int horas = hora2 - hora1;
        int minutos = minuto2 - minuto1;
        int minTranscurridos = horas * 60 + minutos;

        return minTranscurridos;
    }
    public static void main(String[] args) {
        System.out.println(diferenciaMin(1, 35, 15, 20));
    }
}
