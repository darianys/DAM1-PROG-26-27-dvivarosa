package ud2.metodos;

public class GradosRadianes {
    /*
     * . Crea un método que solicite al usuario cuántos grados tiene un ángulo y
     * muestre el equivalente en radianes. Si el ángulo no se encuentra en el rango
     * de 0° a 360°,
     * hay que transformarlo a dicho rango. Nota: El operador módulo (%) puede
     * ayudarnos a
     * convertir un ángulo a su equivalente en el rango comprendido de 0 a 360°.
     * radianes = grados * multiplica π / 180
     */

    public static double radianes(double grados) {
        if (grados < 0 || grados > 360) {
           return radianes(grados * Math.PI / 180);
        }else{
            
        }
        return radianes(grados * Math.PI / 180);
    }
}
