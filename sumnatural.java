public class sumnatural {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first 100 natural numbers is " + sum);
    }
}
