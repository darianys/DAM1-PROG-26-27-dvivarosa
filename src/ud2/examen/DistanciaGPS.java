package ud2.examen;

public class DistanciaGPS {
    static double distancia(double lat1, double lon1, double lat2, double lon2)
{
    lat1 = Math.toRadians(lat1);
    lat2 = Math.toRadians(lat2);
    lon1 = Math.toRadians(lon1);
    lon2 = Math.toRadians(lon2);
    double diferenciaLat = lat1 - lat2;
    double diferencialong = lon1 - lon2;
    final short RADIO = 6371;

    double a = Math.pow(Math.sin(diferenciaLat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(diferencialong / 2), 2);

    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

    double d = RADIO * c;

    return d;
}
public static void main(String[] args) {
    System.out.println(distancia(16523, 62156, 2736, 36764.73));
}
}
