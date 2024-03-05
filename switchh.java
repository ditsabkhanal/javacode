// import java.util.Scanner;

// public class switchh {
//     public static void main(String[] args) {
//         int i;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         i = sc.nextInt();

//         switch (i) {
//             case 1:
//                 System.out.println("Welcome to the library");
//                 break;
//             case 2:
//                 System.out.println("What would you like to read?");
//                 break;
//             case 3:
//                 System.out.println("Thanks for visiting our library!!");
//                 break;
//             default:
//                 System.out.println("Please enter a valid input");
//                 break;
//         }

//         sc.close();
//     }
// }


import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character:");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
        }
        sc.close();
    }
}