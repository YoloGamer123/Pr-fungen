import java.util.Scanner;
import java.util.random.*;

public class Lotto {
    public static void main(String[] args) throws Exception {

        int[] guessednumber = new int[6];

        userNameInput();

        for (int i = 0; i < 6; i++) {
            guessednumber[i] = userNumberInput(guessednumber);
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(guessednumber[i] + " ");
        }
        System.out.println("Schluss");
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

            // TODO: eingabe in guessednummber kontrollieren

            // if (Lottozahlen[index] == guessednumber[0]) {
            // System.out.println("Die Zahl ist schon belegt, bitte gib eine neue Zahl
            // ein");
            // continue;
            // }
            break;
        }

        return eingabe;
    }

    static int[] show(int[] guessednumber) {
        System.out.println("Your numbers are " + guessednumber[0] + "," + guessednumber[1] + "," + guessednumber[2]
                + "," + guessednumber[3] + "," + guessednumber[4] + "," + guessednumber[5] + ".");
        return guessednumber;
    }

}

// /*
// * Was brauche ich alles:
// * Welcome Funktion - check
// * Lottozahlen - check
// * User Input was er nimmt, 6 von 49 -check
// * Enter number 1, number 2 ....
// * Keine Doppelten und keine über 50, <>=
// * output was die Zahlen waren und sortieren lassen
// * Vergleich mit Farben
// * Win lose Funktion
// */