import java.util.Scanner;

public class Biografen_Med_Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // false = ledig, true = reserveret
        boolean[] pladser = {
                false, false, true, false, true, false, false
        };

        boolean reservationGennemført = false;

        while (!reservationGennemført) {

            System.out.println("\nBiografens pladser:");

            // Viser alle pladser
            for (int i = 0; i < pladser.length; i++) {

                if (pladser[i]) {
                    System.out.println(
                            "Plads " + (i + 1) + ": Reserveret"
                    );
                } else {
                    System.out.println(
                            "Plads " + (i + 1) + ": Ledig"
                    );
                }
            }

            System.out.print("\nVælg en plads fra 1 til 7: ");
            int pladsnummer = scanner.nextInt();

            if (pladsnummer < 1 || pladsnummer > 7) {
                System.out.println("Ugyldigt pladsnummer. Prøv igen.");

            } else if (pladser[pladsnummer - 1]) {
                System.out.println("Pladsen er allerede reserveret. Prøv igen.");

            } else {
                pladser[pladsnummer - 1] = true;
                reservationGennemført = true;

                System.out.println(
                        "Plads " + pladsnummer + " er nu reserveret."
                );
            }
        }

        scanner.close();
    }
}
