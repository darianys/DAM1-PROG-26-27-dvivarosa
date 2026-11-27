package ud2.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static ud2.examen.DistanciaGPS.distancia;

public class DistanciaGPSTest {
    @Test
void mismoPuntoDistanciaCero() {
assertEquals(0.0, distancia(42.3897, -8.7099, 42.3897, -8.7099), 0.0001);
}
@Test
void iesChanDoMonteAPontevedra() {
// IES Chan do Monte (Marín) → centro de Pontevedra, ≈ 6.3 km
assertEquals(7.10, distancia(42.3897, -8.7099, 42.4310, -8.6440), 0.1);
}
@Test
void iesChanDoMonteAMarinCentro() {
// IES Chan do Monte → centro de Marín, ≈ 1.2 km
assertEquals(0.82, distancia(42.3897, -8.7099, 42.3930, -8.7010), 0.1);
}
@Test
void pontevedraAMarin() {
// Centro de Pontevedra → centro de Marín, ≈ 7.0 km
assertEquals(6.30, distancia(42.4310, -8.6440, 42.3930, -8.7010), 0.5);
}
@Test
void simetriaIdaYVuelta() {
assertEquals(
distancia(42.3897, -8.7099, 42.4310, -8.6440),
distancia(42.4310, -8.6440, 42.3897, -8.7099),
0.0001);
}
}
