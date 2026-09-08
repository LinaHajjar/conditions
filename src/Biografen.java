import java.util.Scanner;

public class Biografen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // false = ledig, true = reserveret
        boolean[] pladser = {
                false, false, true, false, true, false, false
        };

        System.out.print("Vælg en plads fra 1 til 7: ");
        int pladsnummer = scanner.nextInt();

        if (pladsnummer < 1 || pladsnummer > 7) {
            System.out.println("Ugyldigt pladsnummer.");

        } else if (pladser[pladsnummer - 1] == true) {
            System.out.println("Plads " + pladsnummer
                    + " er allerede reserveret.");

        } else {
            pladser[pladsnummer - 1] = true;

            System.out.println("Plads " + pladsnummer
                    + " er nu reserveret.");
        }

        scanner.close();
    }
}