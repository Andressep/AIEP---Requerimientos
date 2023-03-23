public class App {
    public static void main(String[] args) throws Exception {

        Jugador principiante = new Principiante();
        principiante.setNombre("Andres");
        principiante.setVidas(5);
        principiante.andar(5,10);

        Avanzado avanzado = new Avanzado();
        avanzado.setNombre("Andres Rotisimo");
        avanzado.setVidas(5);
        avanzado.andar(15,20);
        avanzado.conducirVehiculo(50,60,40,90);

    }
}
