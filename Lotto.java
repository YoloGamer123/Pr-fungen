import java.util.Scanner;
import java.util.random.*;


public class Lotto {
    public static void main(String[] args) throws Exception {

        
        int Lottozahlen[] = new int[50];
        int[] guessednumber = new int [5];
        
    
        userNameInput();
        for(int i=0; i<6; i++){
            userNumberInput(Lottozahlen, guessednumber);
        if (i == 5){
            show(Lottozahlen);
        }
        else continue;
    }
        		
}
// Funktionen
    static void userNameInput() {
        Scanner scanner = new Scanner(System.in); 
            System.out.println("Gib deinen Namen ein");
            String player = scanner.nextLine();
            System.out.println("Willkommen " + player + ", viel Spaß beim Spielen");
    }

    static int userNumberInput (int Lottozahlen[], int guessednumber[]) {
		int index;
		while(true){
          System.out.println("Welche Zahl wählst du?");
			Scanner scanname = new Scanner(System.in);
			try{
				guessednumber[0] = scanname.nextInt();
			} catch(Exception e){
				System.out.println("Nur Zahlen eingeben");
				continue;
			}
			if (guessednumber[0] >49 || guessednumber[0] <1) {
				System.out.println("Bitte gib eine Zahl zwischen 1 und 49 ein!");
				continue;
			}
			index = guessednumber[0] -1;

			if (Lottozahlen[index] == guessednumber[0]) {
     			System.out.println("Die Zahl ist schon belegt, bitte gib eine neue Zahl ein");
				continue;
			}
		break;
        }		
		return guessednumber[0];
    }

static int[] show(int[] guessednumber) {
    System.out.println("Your numbers are " + guessednumber[0] +"," +guessednumber[1]+"," +guessednumber[2]+"," +guessednumber[3]+"," +guessednumber[4]+"," +guessednumber[5]+".");
    return guessednumber;    
   }

}


// /*
//  * Was brauche ich alles:
//  * Welcome Funktion - check
//  * Lottozahlen - check
//  * User Input was er nimmt, 6 von 49 -check
//  * Enter number 1, number 2 ....
//  * Keine Doppelten und keine über 50, <>= 
//  * output was die Zahlen waren und sortieren lassen
//  * Vergleich mit Farben
//  * Win lose Funktion
//  */