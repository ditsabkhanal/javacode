import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        int num, rem, digitCount = 0, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();

        while (num > 0) {
            rem = num % 10;
            digitCount++;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.println("Number of digits in a given number is " + digitCount);
        System.out.println("The reverse number is " + rev);

        sc.close();
    }
}