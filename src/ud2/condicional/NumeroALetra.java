package ud2.condicional;

/**
 * @author Darianys Rosales
 *         NumeroALetra
 */
public class NumeroALetra {

    public static void main(String[] args) {

        for (int i = 1; i <= 99; i++) {
            System.out.println(convertirALetra(i));
        }
    }

    public static String convertirALetra(int num) {
        String resultado = "";
        if (num >= 1 && num <= 99) {

            int decena = num / 10;
            int unidad = num % 10;

            if (num >= 10 && num <= 19) {

                String textoDiez = switch (num) {
                    case 10 -> "diez";
                    case 11 -> "once";
                    case 12 -> "doce";
                    case 13 -> "trece";
                    case 14 -> "catorce";
                    case 15 -> "quince";
                    case 16 -> "deiciséis";
                    case 17 -> "diecisiete";
                    case 18 -> "dieciocho";
                    case 19 -> "diecinueve";
                    default -> "Número invalido";
                };
                resultado = textoDiez;

            } else if (num >= 20 && num <= 29) {

                if (num == 20) {
                    resultado = "veinte";
                } else {
                    resultado = "veinti" + obtenerUnidad(unidad);
                }

            } else {

                if (decena == 0) {
                    resultado = obtenerUnidad(unidad);

                } else {
                    String textoDecena = switch (decena) {
                        case 3 -> "treinta";
                        case 4 -> "cuarenta";
                        case 5 -> "cincuenta";
                        case 6 -> "sesenta";
                        case 7 -> "setenta";
                        case 8 -> "ochenta";
                        case 9 -> "noventa";
                        default -> "";
                    };

                    if (unidad == 0) 
                        resultado = textoDecena;
                    else
                        resultado = textoDecena + " y " + obtenerUnidad(unidad);
                }
            }
        }
        return resultado;
    }

    public static String obtenerUnidad(int unidad) {
        String textoUnidad = switch (unidad) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            default -> "Número invalido";
        };
        return textoUnidad;
    }
}
