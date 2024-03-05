import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String repeat;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter address:");
            String address= sc.nextLine();
            System.out.println(name+": "+ address);
            System.out.println("Repeat for another student:(quit/continue)");
            repeat = sc.nextLine();
        } while (!repeat.equals("quit"));
        System.out.println("Good bye!");
        sc.close();
    }
}
