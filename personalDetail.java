import java.util.Scanner;

public class personalDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Nationality: ");
        String nationality = sc.nextLine();

        System.out.println("\nPerson Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);

        sc.close();
    }
}
