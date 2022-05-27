public class Main{
    public static void main(String[] args) {
        Torneo basket = new Torneo(
                Captura.capturarString("Nombre del torneo"),
                Captura.capturarString("Region"),
                Captura.capturarEntero("Numero de equipos participantes"),
                Captura.capturarEntero("Partidos jugados"),
                Captura.capturarEntero("Partidos pendientes"));
        System.out.println("Torneo\n");
        System.out.println("Nombre del torneo: " + basket.getNombre());
        System.out.println("Region: " + basket.getRegion());
        System.out.println("Numero de equipos participantes: " + basket.getNUM_EQ());
        System.out.println("Partidos jugados: " + basket.getP_JUGADOS());
        System.out.println("Partidos pendientes: " + basket.getP_PERDIDOS());

        for(int i=0; i<basket.getNUM_EQ(); i++){
            System.out.println("Nombre del equipo: " + basket.getE(i));
            System.out.println("Division: " + basket.getDiv(i));
            System.out.println("Puntos anotados: " + basket.getPE(i));
            System.out.println("Cantidad de jugadores: " + basket.getJR(i));
            System.out.println("Jugadores:");
            for(int j=0; j<basket.getNUM_EQ(); j++){
                System.out.println("Nombre: " + basket.getnj(i, j));
                System.out.println("Numero de uniforme: "+ basket.getNU(i, j));
            }
            System.out.println("\n");
        }

    }

}