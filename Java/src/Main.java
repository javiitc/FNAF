import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Noches noches = new Noches();

        int contador = 1;
        boolean juego = true;
        String nombre;

        try {
            System.out.println("Enter your name:");
            nombre = sc.nextLine();

            if (nombre.trim().isEmpty()) {
                nombre = "William Afton";
                System.out.println("No name entered. You'll be called 'William Afton'.");
            }
        } catch (Exception e) {
            nombre = "William Afton";
            System.out.println("Error reading name. You'll be called 'William Afton'.");
        }

        System.out.println(nombre + " has sido seleccionado para trabajar como guardia nocturno en Freddy Fazbear's Pizzeria." +
                "Buena suerte!");

        while (juego) {

            boolean nochesJuego = false;

                if (contador == 1) {
                    nochesJuego = noches.noche1();
                } else if (contador == 2) {
                    nochesJuego = noches.noche2();
                } else if (contador == 3) {
                    nochesJuego = noches.noche3();
                } else if (contador == 4) {
                    nochesJuego = noches.noche4();
                } else if (contador == 5) {
                    nochesJuego = noches.noche5();
                } else {
                    System.out.println("==============================================");
                    System.out.println("      HAS SOBREVIVIDO A LOS ANIMATRÓNICOS!");
                    System.out.println("==============================================");
                    juego = false;
                    continue;
                }

                if (nochesJuego) {
                    System.out.println("=============================");
                    System.out.println("            6 AM             ");
                    System.out.println("=============================");
                    contador++;
                } else {
                    System.out.println("================================");
                    System.out.println("           GAME OVER            ");
                    System.out.println("================================");
                    juego = false;
                }
        }
    }
}
