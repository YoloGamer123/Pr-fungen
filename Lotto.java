import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) throws Exception {

        int[] guessedNumber = new int[6];
        int[] randomNumber = new int[6];
        Random random = new Random();
        userNameInput();

        for (int i = 0; i < 6; i++) {
            guessedNumber[i] = userNumberInput(guessedNumber);
        }
        System.out.println();
        System.out.println("Deine Zahlen sind: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(guessedNumber[i] + " ");
        }
        for (int i = 0; i < 6; i++) {
            int eingabe = random.nextInt(49) + 1;
            if (randomNumber[i] != randomNumber[i]) {
                continue; // nicht nontinue sonnst überspringt er nur die Zahl, eine while true schleefe
                          // die bricht wenn es stimmt
            }
            // if();
            // continue; hier muss irgendwas passieren, dass nicht die gleichen generiert
            // werden
        }
        System.out.println();
        System.out.println("Die Lottozahlen sind: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(randomNumber[i] + " ");
        }
        System.out.println();
        if (checkWin(guessedNumber, randomNumber)) {
            System.out.println("Du hast im Lotto gewonnen");
        } else {
            System.out.println("Du hast leider nicht im Lotto gewonnen");
        }
    }

    // Funktionen
    static void userNameInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib deinen Namen ein");
        String player = scanner.nextLine();
        System.out.println("Willkommen " + player + ", viel Spaß beim Spielen");
    }

    static int userNumberInput(int guessednumber[]) {
        int eingabe;
        while (true) {
            System.out.println("Welche Zahl wählst du?");
            Scanner scanname = new Scanner(System.in);
            try {
                eingabe = scanname.nextInt();
            } catch (Exception e) {
                System.out.println("Nur Zahlen eingeben");
                continue;
            }
            if (eingabe > 49 || eingabe < 1) {
                System.out.println("Bitte gib eine Zahl zwischen 1 und 49 ein!");
                continue;
            }
            for (int i = 0; i < 6; i++) {
                if (eingabe == guessednumber[i]) {
                    System.out.println("Die Zahl ist schon belegt, bitte gib eine neue Zahl ein");
                    continue;
                }
                break;
            }
            return eingabe;
        }
    }

    static boolean checkWin(int[] guessedNumber, int[] randomNumber) {
        for (int k = 0; k < 6; k++) {
            if (guessedNumber[k] == randomNumber[k]) {
                return true;
            }
        }
        return false;
    }
}

// Es fehlt:
// Zahlen ordnen
// Error beheben mit 1 1 1 1 1 1 und dem Output
// Generate Numbers duplicate