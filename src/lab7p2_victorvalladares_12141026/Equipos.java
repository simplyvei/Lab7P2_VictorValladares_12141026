package lab7p2_victorvalladares_12141026;

public class Equipos {
    private String nombre;
    private int partidos;
    private int ganados;
    private int empatados;
    private int perdidios;
    private int gf;
    private int gc;
    private int diff;
    private int pts;

    public Equipos() {
    }

    public Equipos(String nombre, int partidos, int ganados, int empatados, int perdidios, int gf, int gc, int diff, int pts) {
        this.nombre = nombre;
        this.partidos = partidos;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidios = perdidios;
        this.gf = gf;
        this.gc = gc;
        this.diff = diff;
        this.pts = pts;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getPerdidios() {
        return perdidios;
    }

    public void setPerdidios(int perdidios) {
        this.perdidios = perdidios;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
