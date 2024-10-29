import java.util.Scanner;

public class recursionqsn2 {
    public static int printFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * printFact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // problem : Print the factorial of n numbers
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = printFact(n);
        System.out.println("The factorial of " + n + " is: " + fact);

    }
}
