public class Principiante extends Jugador {

    public Principiante() {
    }

    public Principiante(String nombre, int vidas) {
        super(nombre, vidas);
    }

    @Override
    public void andar(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 0;
        coordenadaX += x;
        coordenadaY += y;
        System.out.println("El jugador se dirige caminando a la posicion: (" + coordenadaX + "," + coordenadaY + ")");
    }

}
