import java.util.HashMap;
import java.util.Map;

public class Equipo {
    private String nombre, division, trainer;
    private int tp, twin, tlose, players, nteam;
    public Map<Integer, Jugador> jugadores;

    public Equipo(String nombre, String division, String trainer, int tp, int twin, int tlose, int players, int nteam){
        this.jugadores = new HashMap<>();
        this.setNombre(nombre);
        this.setDivision(division);
        this.setTrainer(trainer);
        this.setTp(tp);
        this.setTwin(twin);
        this.setTlose(tlose);
        this.setCantidadDeJugadores(players);
        this.setNteam(nteam);
        this.agregarJugador();
    }
    private void agregarJugador(){
        for(int i=0; i<this.getNumeroJugadores(); i++){
            System.out.printf("\nJugador %d", i+1);
            Jugador jugador = new Jugador(this.validarNumeroUniforme(i,
                    Captura.capturarEntero("Numero de uniforme")),
                    Captura.capturarString("Nombre"),
                    Captura.capturarEntero("Puntos anotados"),
                    Captura.capturarString("Posicion"),
                    Captura.capturarFloat("Estatura"));
            this.jugadores.put(i, jugador);
        }
    }
    public int validarNumeroUniforme(int jugador, int numeroDeUniforme){
        if(this.jugadores.isEmpty()){
            return numeroDeUniforme;
        }
        else{
            for(int i=0; i<this.getJR();i++){
                if(numeroDeUniforme==this.jugadores.get(i).getUniforme()){
                    numeroDeUniforme=Captura.capturarEntero("Invalido. Ingresar otro numero disponible");
                }
            }
        }
        return numeroDeUniforme;
    }
    public int PA(){
        int puntosTotales=0, jugReg;
        jugReg = this.getJR();

        for (int i=0; i<jugReg; i++){
            puntosTotales += this.jugadores.get(i).getPA();
        }
        return puntosTotales;
    }
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDivision(){
        return division;
    }
    private void setDivision(String division){
        this.division = division;
    }
    public String getTrainer(){
        return trainer;
    }
    private void setTrainer(String trainer){
        this.trainer = trainer;
    }
    public int getTp(){
        return tp;
    }
    private void setTp(int tp){
        this.tp = tp;
    }
    public int getTwin(){
        return twin;
    }
    private void setTwin(int twin){
        this.twin = twin;
    }
    public int getTlose(){
        return tlose;
    }
    private void setTlose(int tlose){
        this.tlose = tlose;
    }
    public int getNumeroJugadores(){
        return players;
    }
    private void setCantidadDeJugadores(int players){
        this.players = players;
    }
    public int getNteam(){
        return nteam;
    }
    private void setNteam(int nteam){
        this.nteam = nteam;
    }
    public int getJR(){
        return jugadores.size();
    }
    public String getNombreJugador(int jugador){
        return jugadores.get(jugador).getNombre();
    }
    public int getNumeroUniforme(int jugador){
        return jugadores.get(jugador).getUniforme();
    }
}
