public abstract class Jugador {
    private String nombre;
    private int vidas;

    public Jugador() {
    }

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public abstract void andar(int x, int y);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Jugador{ " +
                "nombre='" + nombre + '\'' +
                ", vidas=" + vidas +
                " }";
    }
}
