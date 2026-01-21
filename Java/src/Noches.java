import java.util.Scanner;

public class Noches {

    public static void noche1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("        NOCHE 1         ");
        System.out.println("========================");
        System.out.println("El telefóno esta sonando! Escuchas a un hombre diciéndote el siguiente mensaje:");
        System.out.println("\" Hola? Se me escucha? Hola! Bienvenido a Freddy Fazbear's Pizza, un lugar mágico para los niños dónde la fantasía y diversión son lo único importante \" \n" +
                "Mmm... sobre los animatrónicos que hay, al parecer se ponen un poco activos durante la noche. Puede sonar peligroso, pero realmente no hay nada de lo que preocuparse! \n" +
                "Tu primer día será sencillo, solo cierra las puertas cuando sea necesario para no malgastar energía.");

        int [] posibilidadMuerteEscondido = {0, 0, 0, 1};
        int [] noHacerNada = {1, 1, 1, 0};
        int energia = 150;
        int cordura = 150;
        boolean conVida = true;

        while (conVida) {

        }

    }

    public static void noche2() {
        System.out.println("========================");
        System.out.println("        NOCHE 2         ");
        System.out.println("========================");
        System.out.println("Hola? Felicidades por haber completado el primer día! No voy a hablar tanto esta vez, ya que Freddy y compañía tienden a ser más activos a medida que avanza la semana. \n" +
                "Si en algún momento te sientes... en peligro, enciende la TV cuando tengas oportunidad, te será de ayuda.");

    }

    public static void noche3() {
        System.out.println("========================");
        System.out.println("        NOCHE 3         ");
        System.out.println("========================");
        System.out.println("Hola, hola? Lo estás haciendo genial! Mucha gente no ha durado tanto! Es decir, no estoy diciendo que hayan muerto. \n" +
                "En fin, mejor no tomaré mucho más de tu tiempo, pues las cosas empiezan a ponerse serias a partir de esta noche");
    }

    public static void noche4 () {
        System.out.println("========================");
        System.out.println("        NOCHE 4         ");
        System.out.println("========================");
        System.out.println("Mmm... escucha, puede que no esté aquí mañana para enviarte un mensaje. Ha sido una mala noche aquí para mi. Sabes...");
        System.out.println("Escuchas en el mensaje como golpeaban la puerta, un estruendo, y de repente la llamada se corta.");
    }

    public static void noche5 (){
        System.out.println("========================");
        System.out.println("        NOCHE 5         ");
        System.out.println("========================");
    }
}
