package ud2.excepciones;

import java.io.IOException;

public class DeclararExcepciones {
    public static char leerLetra() throws IOException {
        char car = ' ';
        System.out.println("Introduce un carácter");
        car = (char) System.in.read();
        return car;        
    }
}
