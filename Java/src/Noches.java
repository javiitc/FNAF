import java.util.Random;
import java.util.Scanner;

public class Noches {

    int cordura = 150;
    int energia = 150;

    public boolean noche1() {
        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();

        System.out.println("========================");
        System.out.println("        NOCHE 1         ");
        System.out.println("========================");
        System.out.println("El telefóno esta sonando! Escuchas a un hombre diciéndote el siguiente mensaje:");
        System.out.println("\" Hola? Se me escucha? Hola! Bienvenido a Freddy Fazbear's Pizza, un lugar mágico para los niños dónde la fantasía y diversión son lo único importante \" \n" +
                "Mmm... sobre los animatrónicos que hay, al parecer se ponen un poco activos durante la noche. Puede sonar peligroso, pero realmente no hay nada de lo que preocuparse! \n" +
                "Tu primer día será sencillo, solo cierra las puertas cuando sea necesario para no malgastar energía.");

        boolean conVida = true;
        int movesLeft = 3;

        while (conVida) {
            for (int i = 0; i < movesLeft; i++) {

                conVida = animatronics.bonnieEvent(this);

                if (!conVida) {
                    break;
                }

                System.out.println("========================");
                System.out.println("|| Cordura: " + cordura + " | Energia: " + energia + " ||");
                System.out.println("========================");

                animatronics.bonnieEvent(this);
                movesLeft--;

                cordura -= 5;
                energia -= 10;

            }
        }
        return conVida;
    }

    public boolean noche2() {
        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NOCHE 2         ");
        System.out.println("========================");
        System.out.println("Hola? Felicidades por haber completado el primer día! No voy a hablar tanto esta vez, ya que Freddy y compañía tienden a ser más activos a medida que avanza la semana. \n" +
                "Si en algún momento te sientes... en peligro, enciende la TV cuando tengas oportunidad, te será de ayuda.");

        boolean conVida = true;
        int movesLeft = 4;
        int[] chanceTV = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        int eventRoll;

            while (conVida) {
                int evento = random.nextInt(3);
                for (int i = 0; i < movesLeft; i++) {

                    conVida = animatronics.bonnieEvent(this);
                    conVida = animatronics.chicaEvent(this);

                    if (!conVida) {
                        break;
                    }

                    System.out.println("========================");
                    System.out.println("|| Cordura: " + cordura + " | Energia: " + energia + " ||");
                    System.out.println("========================");

                    if (evento == 0) {
                        animatronics.bonnieEvent(this);
                        movesLeft--;
                    } else if (evento == 1) {
                        animatronics.chicaEvent(this);
                        movesLeft--;
                    } else {
                        eventRoll = chanceTV[random.nextInt(9)];
                        if (eventRoll == 1) {
                            animatronics.tvEvent(this);
                        }
                    }

                    cordura -= 5;
                    energia -= 10;

                }
            }
        return conVida;
    }

    public boolean noche3() {

        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NOCHE 3         ");
        System.out.println("========================");
        System.out.println("Hola, hola? Lo estás haciendo genial! Mucha gente no ha durado tanto! Es decir, no estoy diciendo que hayan muerto. \n" +
                "En fin, mejor no tomaré mucho más de tu tiempo, pues las cosas empiezan a ponerse serias a partir de esta noche");

        boolean conVida = true;
        int movesLeft = 5;
        int[] chanceTV = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        int eventRoll;

        while (conVida) {
            int evento = random.nextInt(4);
            for (int i = 0; i < movesLeft; i++) {

                conVida = animatronics.bonnieEvent(this);
                conVida = animatronics.chicaEvent(this);
                conVida = animatronics.foxyEvent(this);

                if (!conVida) {
                    break;
                }

                if (evento == 0) {
                    animatronics.bonnieEvent(this);
                    movesLeft--;
                } else if (evento == 1) {
                    animatronics.chicaEvent(this);
                    movesLeft--;
                } else if (evento == 2) {
                    animatronics.foxyEvent(this);
                    movesLeft--;
                } else {
                    eventRoll = chanceTV[random.nextInt(9)];
                    if (eventRoll == 1) {
                        animatronics.tvEvent(this);
                    }
                }
            }
        }
        return conVida;
    }

    public boolean noche4() {

        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NOCHE 4         ");
        System.out.println("========================");
        System.out.println("Mmm... escucha, puede que no esté aquí mañana para enviarte un mensaje. Ha sido una mala noche aquí para mi. Sabes...");
        System.out.println("Escuchas en el mensaje como golpeaban la puerta, un estruendo, y de repente la llamada se corta.");

        boolean conVida = true;
        int movesLeft = 5;
        int[] chanceTV = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        int eventRoll;
        while (conVida) {
            int evento = random.nextInt(5);
            for (int i = 0; i < movesLeft; i++) {

                conVida = animatronics.bonnieEvent(this);
                conVida = animatronics.chicaEvent(this);
                conVida = animatronics.foxyEvent(this);

                if (!conVida) {
                    break;
                }

                if (evento == 0) {
                    animatronics.bonnieEvent(this);
                    movesLeft--;
                } else if (evento == 1) {
                    animatronics.chicaEvent(this);
                    movesLeft--;
                } else if (evento == 2) {
                    animatronics.foxyEvent(this);
                    movesLeft--;
                } else if (evento == 3) {
                    animatronics.freddyEvent(this);
                    movesLeft--;
                } else {
                    eventRoll = chanceTV[random.nextInt(9)];
                    if (eventRoll == 1) {
                        animatronics.tvEvent(this);
                    }
                }
            }
        }
        return conVida;
    }

    public boolean noche5() {

        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NOCHE 5         ");
        System.out.println("========================");

        boolean conVida = true;
        int movesLeft = 5;
        int[] chanceTV = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        int eventRoll;
        while (conVida) {
            int evento = random.nextInt(5);
            for (int i = 0; i < movesLeft; i++) {

                conVida = animatronics.bonnieEvent(this);
                conVida = animatronics.chicaEvent(this);
                conVida = animatronics.foxyEvent(this);
                conVida = animatronics.goldenFreddyEvent(this);

                if (!conVida) {
                    break;
                }

                if (evento == 0) {
                    animatronics.bonnieEvent(this);
                    movesLeft--;
                } else if (evento == 1) {
                    animatronics.chicaEvent(this);
                    movesLeft--;
                } else if (evento == 2) {
                    animatronics.foxyEvent(this);
                    movesLeft--;
                } else if (evento == 3) {
                    animatronics.freddyEvent(this);
                    movesLeft--;
                } else if (evento == 4) {
                    animatronics.goldenFreddyEvent(this);
                    movesLeft--;
                } else {
                    eventRoll = chanceTV[random.nextInt(9)];
                    if (eventRoll == 1) {
                        animatronics.tvEvent(this);
                    }}
            }

        }
        return conVida;
    }

}
