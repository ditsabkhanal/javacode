import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        float h,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  height:");
        h = sc.nextFloat();
        System.out.println("Enter weight:");
        w = sc.nextFloat();
        sc.close();
        float bmi = w / (h * h);
         if (bmi<=15) {
            System.out.println("Underweight");
         }
         else if (bmi <= 25) {
             System.out.println("Normal weight");
         }
         else {
            System.out.println("Over weight");
         }
    }    
}
