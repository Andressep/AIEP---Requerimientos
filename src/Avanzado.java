public class Avanzado extends Jugador{
    @Override
    public void andar(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 0;
        coordenadaX += x;
        coordenadaY += y;
        System.out.println("El jugador avanzo caminando a la posicion: (" + coordenadaX + "," + coordenadaY + ")");
    }

    public void conducirVehiculo(int x, int y, int velocidad, int velocidadMaxima) {
        int posicionX = 0;
        int posicionY = 0;
        if ( velocidad <= velocidadMaxima ) {
            posicionX += x;
            posicionY += y;
            System.out.println("Usted conduce a: " + velocidad + "km/h y su posicion actual es: (" + posicionX + "," + posicionY + ")");
        }
        else {
            System.out.println("Usted excedio el limite de velocidad asignado, baje la velocidad.");
        }
    }
}
