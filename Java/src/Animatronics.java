import java.util.Random;
import java.util.Scanner;

public class Animatronics {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Noches noches = new Noches();


    int choice = 0;
    boolean isAlive = true;

    public boolean bonnieEvent() {

        int[] chanceDeath = {1, 0, 0, 0};
        int deathRoll;
        int energy = noches.energia;

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

        return isAlive;

    }

    public boolean chicaEvent() {

        int[] chanceDeath = {1, 0, 0, 0};
        int deathRoll;
        int energy = noches.energia;

        while (isAlive) {

            System.out.println("You check the cameras and notice Chica's getting closer.");

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
                        System.out.println("It didn't bypass her system!");
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
                    System.out.println("You stay still as she scans the room.");
                    deathRoll = chanceDeath[random.nextInt(3)];

                    if (deathRoll == 0) {
                        System.out.println("You've been caught!");
                        isAlive = false;
                    } else if (deathRoll == 1) {
                        System.out.println("She doesn't seem to notice!");
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

    public int tvEvent() {

        // int[] chanceTV = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0}; <- poner en noche2()
        int energy = noches.energia;
        int sanity = noches.cordura;

        System.out.println("You manage to find the TV remote. Do you want to watch TV? (Gives +10 sanity!)");

        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Choose what to do: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You pass the hour watching TV.");
                energy -= 10;
                sanity += 15;
                break;
            case 2:
                System.out.println("You decide to focus on your work instead.");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

        return sanity;

    }

    public boolean foxyEvent() {

        int[] chanceDeath = {1, 0, 1, 0};
        int deathRoll;

        int[] chanceLife = {1, 0, 1, 0, 1, 0};
        int lifeRoll;
        int energy = noches.energia;

        while (isAlive) {

            System.out.println("You check the cameras and notice Foxy's running down your hall.");

            System.out.println("1. Hide");
            System.out.println("2. Close curtain (-10 power)");
            System.out.println("3. Do nothing");
            System.out.println("Choose what to do: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You hide behind the Freddy mask.");
                    deathRoll = chanceDeath[random.nextInt(3)];

                    if (deathRoll == 1) {
                        System.out.println("It didn't bypass her system!");
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
                    System.out.println("You stay still as she scans the room.");
                    lifeRoll = chanceLife[random.nextInt(9)];

                    if (lifeRoll == 1) {
                        System.out.println("You've been caught!");
                        isAlive = false;
                    } else if (lifeRoll == 0) {
                        System.out.println("She doesn't seem to notice!");
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

    public int freddyEvent() {

        int energy = noches.energia;
        int energySubtract = (int) (energy * 0.15);
        int finalEnergy;

        System.out.println("You check the cameras and notice Freddy's getting closer. " +
                "He can't be fooled by his own mask, but he doesn't seem to be harmful.");

        System.out.println("You notice your power got immediately drained.");
        finalEnergy = energy - energySubtract;

        return finalEnergy;

    }

    public boolean goldenFreddyEvent() {

        int[] chanceDeath = {1, 1, 0, 1};
        int deathRoll;

        while (isAlive) {
            System.out.println("Golden Freddy appears lifeless in your office. You're paralyzed.");
            deathRoll = chanceDeath[random.nextInt(3)];

            if (deathRoll == 1) {
                System.out.println("You didn't survive.");
                isAlive = false;
            } else if (deathRoll == 0) {
                System.out.println("Was it just a hallucination?");
                isAlive = true;
            }


        }

        return isAlive;

    }

}

