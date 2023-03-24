public class Avanzado extends Jugador {
    private final Auto auto;

    @Override
    public void andar(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 0;
        coordenadaX += x;
        coordenadaY += y;
        System.out.println("El jugador se dirige caminando a la posicion: (" + coordenadaX + "," + coordenadaY + ")");
    }

    static class Auto {
        private int velocidadMaxima;

        public Auto(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
        }

        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }

        public void conducirVehiculo(int x, int y, int velocidad) {
            int velocidadMaxima = this.velocidadMaxima;
            int posicionX = 0;
            int posicionY = 0;
            if ( velocidad <= velocidadMaxima ) {
                posicionX += x;
                posicionY += y;
                System.out.println("Usted conduce a: " + velocidad + "km/h, el limite es: " + velocidadMaxima + "km/h y se dirige hacia: (" + posicionX + "," + posicionY + ")");
            }
            else {
                System.out.println("Usted conduce a: " + velocidad + " excedio el limite de velocidad asignado que es: " + velocidadMaxima + ", baje la velocidad.");
            }
        }
    }
    public Avanzado(int velocidadMaxima) {
        this.auto = new Auto(velocidadMaxima);
    }
    public void conducir(int x, int y, int velocidad) {
        auto.conducirVehiculo(x, y, velocidad);
    }
}
