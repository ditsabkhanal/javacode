import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a is the largest number?"+(a>b));
        System.out.println("The first number is positive?"+(a>0));
        System.out.println("The second number is even?"+(b%2==0));
        System.out.println("The  second number is multiple of 5?"+(b%5==0));
        sc.close();
    }
}


//int max= a>b?(a>c?a:c)