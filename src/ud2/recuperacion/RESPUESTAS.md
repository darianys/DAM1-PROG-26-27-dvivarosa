# Respuestas de Depuración - UD3

## Ejercicio 1: Montaña Rusa

| Nº | Línea | Qué falla y por qué | Entrada que lo demuestra | Salida esperada | Salida obtenida |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | 33 | Se reinicia `mayor = Integer.MIN_VALUE` al final de cada vuelta, perdiendo el valor máximo real para la siguiente iteración. | `[4, 10, 3, 2]` | `1` | `2` |
| 2 | 36 | Solo comprueba `if (primer > ultimo)` como caso especial, ignorando si el último elemento es un pico o qué ocurre con el segundo elemento. | `[10, 3, 2, 4]` | `1` | `2` |
| 3 | 17 | El bucle `for (int i = 0; i < (alturas.length / alturas.length); i++)` es innecesario porque `n / n` siempre vale `1`; basta con `alturas[0]`. | `[4, 10, 3, 2]` | `1` | `2` |