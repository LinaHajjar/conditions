import java.util.Scanner;

public class OpsamlingConditions {

    public static void main(String[] args) {

        int age = 20;
        boolean hasTicket = true;
        //int day = 7;

        System.out.println("choose a day: integer between 1 and 7");
        int day;

        Scanner input=new Scanner(System.in);

        day=input.nextInt();



        if (age >= 18 && hasTicket) {
            System.out.println("Du må komme ind");
        } else {
            System.out.println("Du må ikke komme ind");
        }

        switch (day) {
            case 1:
                System.out.println("Mandag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lørdag");
                break;
            case 7:
                System.out.println("Søndag");
                break;
            default:
                System.out.println("no date to print");
        }
    }

}
