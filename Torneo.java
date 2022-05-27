import java.util.HashMap;
import java.util.Map;

public class Torneo {
    private String nombre, region;
    private int p_jugados, p_perdidos, num_eq;
    private Map <Integer, Equipo> equipos;
    public Torneo(String nombre, String region, int p_jugados, int p_perdidos, int num_eq){
        this.equipos = new HashMap<>();
        this.setNombre(nombre);
        this.setRegion(region);
        this.setNUM_EQ(num_eq);
        this.setP_JUGADOS(p_jugados);
        this.setP_PERDIDOS(p_perdidos);
        this.agregarEquipos();
    }
    private void agregarEquipos(){
        for(int i=0; i<this.getNUM_EQ(); i++){
            Equipo equipo = new Equipo(
                    Captura.capturarString("Nombre de equipo"),
                    Captura.capturarString("Division"),
                    Captura.capturarString("Nombre del entrenador"),
                    Captura.capturarEntero("Torneos con participacion"),
                    Captura.capturarEntero("Torneos ganados"),
                    Captura.capturarEntero("Torneos perdidos"),
                    Captura.capturarEntero("Cantidad de jugadores en el equipo"), i);

            this.equipos.put(i, equipo);
        }
    }
    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRegion() {
        return region;
    }
    private void setRegion(String region) {
        this.region = region;
    }
    public int getP_JUGADOS() {
        return p_jugados;
    }
    private void setP_JUGADOS(int p_jugados) {
        this.p_jugados = p_jugados;
    }
    public int getP_PERDIDOS() {
        return p_perdidos;
    }
    private void setP_PERDIDOS(int p_perdidos) {
        this.p_perdidos = p_perdidos;
    }
    public int getNUM_EQ() {
        return num_eq;
    }
    private void setNUM_EQ(int num_eq) {
        this.num_eq = num_eq;
    }
    public int getJR(int equipo){
        return this.equipos.get(equipo).getJR();
    }
    public String getnj(int equipo, int jugador){
        return this.equipos.get(equipo).getNombreJugador(jugador);
    }
    public int getNU(int equipo, int jugador){
        return this.equipos.get(equipo).getNumeroUniforme(jugador);
    }
    public String getE(int equipo){
        return this.equipos.get(equipo).getNombre();
    }
    public String getDiv(int equipo){
        return this.equipos.get(equipo).getDivision();
    }
    public int getPE(int equipo){
        return this.equipos.get(equipo).PA();
    }
    public int getPuntosAnotados(int equipo){
        return this.equipos.get(equipo).PA();
    }
}
