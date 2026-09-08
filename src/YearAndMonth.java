    import java.util.Scanner;

    public class YearAndMonth {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Indtast et årstal: ");
            int year = scanner.nextInt();

            System.out.print("Indtast et månedstal mellem 1 og 12: ");
            int month = scanner.nextInt();

            String monthName = "";

            /*
            if (month == 1) {
                monthName = "januar";
            }

            if (month == 2) {
                monthName = "februar";
            }

            if (month == 3) {
                monthName = "marts";
            }

            if (month == 4) {
                monthName = "april";
            }

            if (month == 5) {
                monthName = "maj";
            }

            if (month == 6) {
                monthName = "juni";
            }

            if (month == 7) {
                monthName = "juli";
            }

            if (month == 8) {
                monthName = "august";
            }

            if (month == 9) {
                monthName = "september";
            }

            if (month == 10) {
                monthName = "oktober";
            }

            if (month == 11) {
                monthName = "november";
            }

            if (month == 12) {
                monthName = "december";
            }

            if (month < 1 || month > 12) {
                System.out.println("Månedstallet skal være mellem 1 og 12.");
            }


            if (month >= 1 && month <= 12) {
                System.out.println("Vi er i " + monthName + " " + year + ".");
            }*/



            switch (month) {
                case 1:
                    monthName = "januar";
                    break;
                case 2:
                    monthName = "februar";
                    break;
                case 3:
                    monthName = "marts";
                    break;
                case 4:
                    monthName = "april";
                    break;
                case 5:
                    monthName = "maj";
                    break;
                case 6:
                    monthName = "juni";
                    break;
                case 7:
                    monthName = "juli";
                    break;
                case 8:
                    monthName = "august";
                    break;
                case 9:
                    monthName = "september";
                    break;
                case 10:
                    monthName = "oktober";
                    break;
                case 11:
                    monthName = "november";
                    break;
                case 12:
                    monthName = "december";
                    break;
            }

            switch (month) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("Vi er i " + monthName + " " + year + ".");
                    break;
                default:
                    System.out.println("Månedstallet skal være mellem 1 og 12.");
            }



            if (year % 4 == 0) {
                System.out.println(year + " er et skudår.");
                System.out.println("Februar har 29 dage.");
            }

            if (year % 4 != 0) {
                System.out.println(year + " er et normalt år.");
                System.out.println("Februar har 28 dage.");
            }





            scanner.close();




        }
    }

