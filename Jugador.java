public class Jugador {
    private int uniforme, pa;
    private String nombre, pos;
    private float estatura;

    public Jugador(int uniforme, String nombre, int pa, String pos, float estatura){
        this.setUniforme(uniforme);
        this.setNombre(nombre);
        this.setPA(pa);
        this.setPos(pos);
        this.setEstatura(estatura);
    }
    private void setUniforme(int uniforme) {
        this.uniforme = uniforme;
    }
    public int getUniforme() {
        return uniforme;
    }
    private void setPA(int pa) {
        this.pa = pa;
    }
    public int getPA() {
        return pa;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    private void setPos(String pos) {
        this.pos = pos;
    }
    public String getPos() {
        return pos;
    }
    private void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public float getEstatura() {
        return estatura;
    }
}
