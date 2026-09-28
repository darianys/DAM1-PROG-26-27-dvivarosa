package ud1.operaciones;
/**
 * @author  Darianys Sinayd Vivas Rosales
 * EvaluarExpresiones2
 */

public class EvaluarExpresiones2 {
    public static void main(String[] args) {
        int resultado = 10;
        resultado += 5 - 3 * 2;
        boolean resultado1 = 4 + 5 > 10 - 3;

        //el resultado y luego comparo con los operadores:
        //true && false || true = verdadero:
        //verdadero y falso = falso
        //falso o verdadero = verdadero
        //&& -> verdadero si los dos lo son sino es falso
        //|| -> devuelve verdadero si uno de alguno es verdadero

        //lo mismo que el anterior, pude hacerlo directamente en el sout
        boolean resultado2 = 5 > 3 && 8 < 6 || 3 == 3;
        int resultado3 = (4 + 3) * 2 - 6 / 3;
        int a = 10, b = 20;

        //como funciona el ?: 
        //? a = si es a devuelve a
        //: b = si no es a devuelve b
        //si es, a; sino, b
        int resultado4 = a > b ? a : b;
        int x = 5;

        //++ : abrevia un +1
        //-- : abrevia un -1
        //cuando se ponen antes primero se incrementa el valor y luego se hace la operacion
        //cuando se ponen despues el valor se incrementa despues de la operacion 
        //cuando va despues se suele ver cambios en otros cosas, en estos simples no
        int resultado5 = ++x * 2;

        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
    }

}
