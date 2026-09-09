import java.util.Scanner;

public class Vejret {
    public static void main(String[] args) {

        int temperatur = 20;

        if (temperatur < 0) {
            System.out.println("Frostvejr");
        } else if (temperatur > 25) {
            System.out.println("Varmt");
        } else {
            System.out.println("Mildt vejr");
        }
    }

}
