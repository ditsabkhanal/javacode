import java.util.Scanner;
public class week {
    public  static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int n = sc.nextInt();
        String day;

        switch (n) {
            case 1:
                day = "Sunnday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid input";
        }
        System.out.println("Day is " + day);

        sc.close();
    }
}
