import static java.lang.IO.println;

public class WeekDays {

    int day = 3;

    void main(){
        IfElse(day);

        IfMethod(day);
    }

    void IfElse(int day) {
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
    }

    void IfMethod(int day) {
        if (day == 1)
            System.out.println("Monday");
        if (day == 2)
            System.out.println("Tuesday");
        if (day == 3)
            System.out.println("Wednesday");
        if (day == 4)
            System.out.println("Thursday");
        if (day == 5)
            System.out.println("Friday");
        if (day == 6)
            System.out.println("Saturday");
        if (day == 7)
            System.out.println("Sunday");
    }

    void SwitchMethod(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Onsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid output");
        }
    }



}
