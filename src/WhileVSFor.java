import java.util.Scanner;

public class WhileVSFor {


    static void main() {
/*int i;
        for(i=1; i>=5; i++){
            System.out.println(i);
        }
        System.out.println("we are now outside the loop");
        System.out.println(i);

        Scanner scanner = new Scanner(System.in);
        String password;


        //med for
        for (int i = 1; i <= 3; i++) {
            System.out.print("Indtast password: ");
            password = scanner.nextLine();

            if (password.equals("secret123")) {
                System.out.println("Korrekt password!");
                break;
            }

            System.out.println("Forkert. Forsøg " + i + " af 3");*/


//med while

            Scanner scanner=new Scanner(System.in);

            System.out.print("Indtast password: ");
            String password = scanner.nextLine();

            while (!password.equals("secret123")) {
                System.out.println("Forkert password. Prøv igen:");

                password = scanner.nextLine();
            }

            System.out.println("Korrekt password!");



        }
    }


