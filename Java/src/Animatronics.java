import java.util.Random;
import java.util.Scanner;

public class Animatronics {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Noches noches = new Noches();


    int choice = 0;
    boolean isAlive = true;

    public boolean bonnieEvent() {

        int[] chanceDeath = {1, 0 ,0, 0};
        int deathRoll;
        int energy = noches.energia;

        while (isAlive) {

            System.out.println("You check the cameras and notice Bonnie's getting closer.");

            System.out.println("1. Hide");
            System.out.println("2. Close door (-10 power)");
            System.out.println("3. Do nothing");
            System.out.println("Choose what to do: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You hide behind the Freddy mask.");
                    deathRoll = chanceDeath[random.nextInt(3)];

                    if (deathRoll == 1) {
                        System.out.println("It didn't bypass his system!");
                        isAlive = false;
                    } else if (deathRoll == 0) {
                        System.out.println("It worked!");
                        isAlive = true;
                    }
                    break;
                case 2:
                    System.out.println("You close the door, consuming 10 power.");
                    energy -= 10;
                    break;
                case 3:
                    System.out.println("You stay still as he scans the room.");
                    deathRoll = chanceDeath[random.nextInt(3)];

                    if (deathRoll == 0) {
                        System.out.println("You've been caught!");
                        isAlive = false;
                    } else if (deathRoll == 1) {
                        System.out.println("He doesn't seem to notice!");
                        isAlive = true;
                    }
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        return isAlive;

    }

}

