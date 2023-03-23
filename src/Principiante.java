public class Principiante extends Jugador {

    public Principiante() {
    }

    @Override
    public void andar(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 0;
        coordenadaX += x;
        coordenadaY += y;
        System.out.println("El jugador avanzo caminando a la posicion: (" + coordenadaX + "," + coordenadaY + ")");
    }

}
