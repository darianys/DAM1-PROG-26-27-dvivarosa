package ud2.examen;

public class DistanciaGPS2 {
    static double distancia(double lat1, double lon1, double lat2, double lon2){
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        final int R = 6371;

        double diferenciaLat = lat1 - lat2;
        double diferencialon = lon1 - lon2;


        int a = Math.sin() * ( diferenciaLat/ 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(), 2) * (diferencialon/ 2);

        int c = 2 * Math.pow(Math.atan(), 2) * (Math.sqrt(a) * Math.sqrt(1 - a));

        int d = R * c;

        return d;
    }
}
