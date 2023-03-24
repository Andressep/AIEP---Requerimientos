import java.util.Scanner;

public class App {

    private static void crearJugador(int jugador) {
        if ( jugador == 1) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cual va a ser su nombre??");
            String nombre = scanner.nextLine();
            System.out.println("Con cuantas vidas esta iniciando?");
            int vidas = scanner.nextInt();
            System.out.println("Se desplazara horizontalmente hacia: ");
            int x = scanner.nextInt();
            System.out.println("Se desplazara verticalmente hacia: ");
            int y = scanner.nextInt();
            scanner.close();

            Jugador principiante = new Principiante(nombre, vidas);
            System.out.println("El jugador: "+ principiante.getNombre());
            System.out.println("Posee: " + principiante.getVidas() + " vidas");
            principiante.andar(x, y);
        }
        if ( jugador == 2 ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cual va a ser su nombre??");
            String nombre = scanner.nextLine();
            System.out.println("Con cuantas vidas esta iniciando?");
            int vidas = scanner.nextInt();
            System.out.println("Se desplazara horizontalmente hacia: ");
            int x = scanner.nextInt();
            System.out.println("Se desplazara verticalmente hacia: ");
            int y = scanner.nextInt();
            System.out.println("Si desea moverse en auto seleccione 1 de lo contrario seleccione 0.");
            int moverse = scanner.nextInt();
            System.out.println("Cual es la velocidad maxima del vehiculo que ocupara?");
            int velocidadMaxima = scanner.nextInt();

            Avanzado avanzado = new Avanzado(velocidadMaxima);
            System.out.println("A que velocidad desea conducir?");
            int velocidad = scanner.nextInt();
            scanner.close();

            avanzado.setNombre(nombre);
            avanzado.setVidas(vidas);
            System.out.println("El jugador: "+ avanzado.getNombre());
            System.out.println("Posee: " + avanzado.getVidas() + " vidas");
            if ( moverse == 1) {
                avanzado.conducir(x, y, velocidad);
            }
            if ( moverse == 0 ) {
                avanzado.andar(x, y);
            }
        }

    }
    public static void main(String[] args) throws Exception {

        System.out.println("""
                Bienvenido al juego de hoy, a continuacion creara su personaje.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Que tipo de jugador es usted?
                1- Principiante
                2- Avanzado
                """);
        int jugador = scanner.nextInt();
        crearJugador(jugador);
        scanner.close();
    }
}
