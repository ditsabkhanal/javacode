import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        s = sc.nextInt();
        sc.close();
        System.out.print(a + "\t");
        System.out.print(b + "\t");
        for (int i = 1; i < s - 1; i++) {
            c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
        }
    }
}