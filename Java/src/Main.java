import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Noches noches = new Noches();

        int contador = 1;
        boolean juego = true;

        System.out.println("Introduce tu nombre:");
        String nombre = sc.next();
        System.out.println(nombre + " has sido seleccionado para trabajar como guardia nocturno en Freddy Fazbear's Pizzeria." +
                "Buena suerte!");

        while (juego) {

            boolean nochesJuego = false;

                if (contador == 1) {
                    nochesJuego = noches.noche1();
                    contador++;
                } else if (contador == 2) {
                    nochesJuego = noches.noche2();
                    contador++;
                } else if (contador == 3) {

                } else if (contador == 4) {

                } else {

                }

                if (!nochesJuego) {
                    System.out.println("==============================");
                    System.out.println("          GAME OVER            ");
                    System.out.println("==============================");
                    juego = false;
                }
        }
    }
}
