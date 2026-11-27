package ud2.examen;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static ud2.examen.SubidaAlquiler.subidaAlquiler;

public class SubidaAlquilerTest {

@Test
void rentaNegativaDevuelveCero() {
assertEquals(0.0, subidaAlquiler(-100.0, 500.0));
}
@Test
void precioReferenciaNegativoDevuelveCero() {
assertEquals(0.0, subidaAlquiler(500.0, -100.0));
}
@Test
void ambosNegativosDevuelveCero() {
assertEquals(0.0, subidaAlquiler(-1.0, -1.0));
}
@Test
void rentaSuperiorAPrecioReferenciaNoSube() {
// renta 600 > referencia 500 → subida 0
assertEquals(0.0, subidaAlquiler(600.0, 500.0));
}
@Test
void rentaIgualAPrecioReferenciaNoSube2() {
// renta == referencia → subida 0
assertEquals(0.0, subidaAlquiler(500.0, 500.0));
}
@Test
void rentaIgualAPrecioReferenciaNoSube() {
// renta == referencia → subida 0
assertEquals(0.0, subidaAlquiler(500.0, 500.0));
}
@Test
void rentaInferiorSubidaLimitadaAl2PorCiento() {
// renta 400, referencia 500 → 2% de 400 = 8 < 100 (margen hasta referencia)
assertEquals(8.0, subidaAlquiler(400.0, 500.0), 0.0001);
}
@Test
void rentaInferiorSubidaLimitadaPorPrecioReferencia() {
// renta 495, referencia 500 → 2% de 495 = 9.9, pero margen hasta referencia = 5
// La subida máxima es 5 (no puede superar la referencia)
assertEquals(5.0, subidaAlquiler(495.0, 500.0), 0.0001);
}
@Test
void rentaMuyInferiorSubidaEsEl2PorCiento() {
// renta 100, referencia 10000 → 2% de 100 = 2
assertEquals(2.0, subidaAlquiler(100.0, 10000.0), 0.0001);
}
@Test
void rentaIgualAPrecioReferenciaNoSube() {
// renta == referencia → subida 0
assertEquals(0.0, subidaAlquiler(500.0, 500.0));
}
@Test
void rentaInferiorSubidaLimitadaAl2PorCiento() {
// renta 400, referencia 500 → 2% de 400 = 8 < 100 (margen hasta referencia)
assertEquals(8.0, subidaAlquiler(400.0, 500.0), 0.0001);
}
@Test
void rentaInferiorSubidaLimitadaPorPrecioReferencia() {
// renta 495, referencia 500 → 2% de 495 = 9.9, pero margen hasta referencia = 5
// La subida máxima es 5 (no puede superar la referencia)
assertEquals(5.0, subidaAlquiler(495.0, 500.0), 0.0001);
}
@Test
void rentaMuyInferiorSubidaEsEl2PorCiento2() {
// renta 100, referencia 10000 → 2% de 100 = 2
assertEquals(2.0, subidaAlquiler(100.0, 10000.0), 0.0001);
}

}
