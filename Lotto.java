import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) throws Exception {

        int[] guessedNumber = new int[6];
        int[] randomNumbers = new int[6];
        userNameInput();

        for (int i = 0; i < 6; i++) {
            guessedNumber[i] = userNumberInput(guessedNumber);
        }
        System.out.println();
        System.out.println("Deine Zahlen sind: ");
        for (int i = 0; i < guessedNumber.length; i++) {
            Arrays.sort(guessedNumber);
            System.out.print(guessedNumber[i] + " ");
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = generateNumber(randomNumbers);
        }

        System.out.println();
        System.out.println("Die Lottozahlen sind: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            Arrays.sort(randomNumbers);
            System.out.print(randomNumbers[i] + " ");
        }

        System.out.println();
        if (checkWin(guessedNumber, randomNumbers)) {
            System.out.println("Du hast den 6er im Lotto gewonnen");
        } else {
            System.out.println("Du hast leider nicht den 6er im Lotto gewonnen");
        }
    }

    static int generateNumber(int[] randomNumbers) {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(6) + 1;

            boolean found = false;
            for (int i = 0; i < 6; i++) {

                if (randomNumber == randomNumbers[i]) {
                    found = true;
                }

            }

            if (found) {
                continue;
            }
            return randomNumber;
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
            boolean found = false;
            for (int i = 0; i < 6; i++) {
                if (eingabe == guessednumber[i]) {
                    System.out.println("Die Zahl ist schon belegt, bitte gib eine neue Zahl ein");
                    found = true;
                }
            }
            if (found) {
                continue;
            }
            return eingabe;
        }
    }

    static boolean checkWin(int[] guessedNumber, int[] randomNumber) {
        for (int k = 0; k < 6; k++) {
            if (guessedNumber[k] == randomNumber[k]) {
                return true;
            }
            // hier noch was ändern
        }
        return false;
    }
}

// Es fehlt:
// Zahlen ordnen
// Error beheben mit 1 1 1 1 1 1 und dem Output
// Generate Numbers duplicate