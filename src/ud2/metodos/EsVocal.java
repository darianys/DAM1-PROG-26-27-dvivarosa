package ud2.metodos;

public class EsVocal {
    public static boolean esVocal(char vocal) {
        return (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u');
    }

    public static void main(String[] args) {
        System.out.println(esVocal('i'));
    }
}
