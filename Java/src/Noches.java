import java.util.Random;
import java.util.Scanner;

public class Noches {

    int cordura = 150;
    int energia = 150;

    public boolean noche1() {
        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();

        System.out.println("========================");
        System.out.println("        NIGHT 1         ");
        System.out.println("========================");
        System.out.println("The phone is ringing! You hear a man telling you the following message:");
        System.out.println("\" Hello? Can you hear me? Hello! Welcome to Freddy Fazbear's Pizza, a magical place for kids where fantasy and fun are the only things that matter. \" \n" +
                "Mmm... about the animatronics we have, apparently they get a bit active during the night. It may sound dangerous, but there's really nothing to worry about! \n" +
                "Your first day will be simple, just close the doors when necessary to avoid wasting power.");

        boolean conVida = true;
        int movesLeft = 3;

        while (conVida && movesLeft > 0) {

            System.out.println("========================");
            System.out.println("|| Sanity: " + cordura + " | Power: " + energia + " ||");
            System.out.println("========================");

                conVida = animatronics.bonnieEvent(this);

                if (!conVida) {
                break;
                 }

                cordura -= 5;
                movesLeft--;

                if (energia <= 0) {
                    System.out.println("You've run out of power, in the complete darkness the animatronics have taken advantage to attack you");
                    conVida = false;
                }

            }
        return conVida;
    }

    public boolean noche2() {
        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NIGHT 2         ");
        System.out.println("========================");
        System.out.println("Hello? Congratulations on completing the first day! I won't talk as much this time, since Freddy and company tend to be more active as the week progresses. \n" +
                "If at any point you feel... in danger, turn on the TV when you get the chance, it will help you.");


        boolean conVida = true;
        int movesLeft = 4;

            while (conVida && movesLeft > 0) {

                System.out.println("========================");
                System.out.println("|| Sanity: " + cordura + " | Power: " + energia + " ||");
                System.out.println("========================");

                int evento = random.nextInt(3);

                    if (evento == 0) {
                        conVida = animatronics.bonnieEvent(this);
                    } else if (evento == 1) {
                        conVida = animatronics.chicaEvent(this);
                    } else {
                        animatronics.tvEvent(this);
                    }

                if (!conVida) {
                    break;
                }

                    cordura -= 5;
                    movesLeft--;

                if (energia <= 0) {
                    System.out.println("You've run out of power, in the complete darkness the animatronics have taken advantage to attack you");
                    conVida = false;
                }
            }
        return conVida;
    }

    public boolean noche3() {

        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NIGHT 3         ");
        System.out.println("========================");
        System.out.println("Hello, hello? You're doing great! Not many people have lasted this long! I mean, I'm not saying they died. \n" +
                "Anyway, I'd better not take any more of your time, as things start to get serious from this night on");


        boolean conVida = true;
        int movesLeft = 5;

        while (conVida && movesLeft > 0) {

            System.out.println("========================");
            System.out.println("|| Sanity: " + cordura + " | Power: " + energia + " ||");
            System.out.println("========================");

            int evento = random.nextInt(4);

                if (evento == 0) {
                    conVida = animatronics.bonnieEvent(this);
                } else if (evento == 1) {
                    conVida = animatronics.chicaEvent(this);
                } else if (evento == 2) {
                    conVida = animatronics.foxyEvent(this);
                } else {
                    animatronics.tvEvent(this);
                }

            if (!conVida) {
                break;
            }

                cordura -= 5;
                movesLeft--;

            if (energia <= 0) {
                System.out.println("You've run out of power, in the complete darkness the animatronics have taken advantage to attack you");
                conVida = false;
            }
        }
        return conVida;
    }

    public boolean noche4() {

        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NIGHT 4         ");
        System.out.println("========================");
        System.out.println("Mmm... listen, I may not be here tomorrow to send you a message. It's been a bad night here for me. You know...");
        System.out.println("You hear in the message how they were banging on the door, a crash, and suddenly the call cuts off.");

        boolean conVida = true;
        int movesLeft = 5;

        while (conVida && movesLeft > 0) {

            System.out.println("========================");
            System.out.println("|| Sanity: " + cordura + " | Power: " + energia + " ||");
            System.out.println("========================");

            int evento = random.nextInt(5);

                if (evento == 0) {
                    conVida = animatronics.bonnieEvent(this);
                } else if (evento == 1) {
                    conVida = animatronics.chicaEvent(this);
                } else if (evento == 2) {
                    conVida = animatronics.foxyEvent(this);
                } else if (evento == 3) {
                    animatronics.freddyEvent(this);
                } else {
                    animatronics.tvEvent(this);
                }

            if (!conVida) {
                break;
            }

                cordura -= 5;
                movesLeft--;

            if (energia <= 0) {
                System.out.println("You've run out of power, in the complete darkness the animatronics have taken advantage to attack you");
                conVida = false;
            }
        }
        return conVida;
    }

    public boolean noche5() {

        Scanner sc = new Scanner(System.in);
        Animatronics animatronics = new Animatronics();
        Random random = new Random();

        System.out.println("========================");
        System.out.println("        NIGHT 5         ");
        System.out.println("========================");

        boolean conVida = true;
        int movesLeft = 6;

        while (conVida && movesLeft > 0) {

            System.out.println("========================");
            System.out.println("|| Sanity: " + cordura + " | Power: " + energia + " ||");
            System.out.println("========================");

            int evento = random.nextInt(6);

                if (evento == 0) {
                    conVida = animatronics.bonnieEvent(this);
                } else if (evento == 1) {
                    conVida = animatronics.chicaEvent(this);
                } else if (evento == 2) {
                    conVida = animatronics.foxyEvent(this);
                } else if (evento == 3) {
                    animatronics.freddyEvent(this);
                } else if (evento == 4) {
                    conVida = animatronics.goldenFreddyEvent(this);
                } else {
                    animatronics.tvEvent(this);
                }

            if (!conVida) {
                break;
            }

                cordura -= 5;
                movesLeft--;

                if (energia <= 0) {
                    System.out.println("You've run out of power, in the complete darkness the animatronics have taken advantage to attack you");
                    conVida = false;
                }
        }
        return conVida;
    }

}
