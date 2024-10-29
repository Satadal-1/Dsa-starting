import java.util.Scanner;

public class recursionqsn4 {
    public static int powerPrint(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerPrint(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use recursive function to print X^n;
        System.out.println("Enter the base number: ");
        int x = sc.nextInt();
        System.out.println("Enter the power:");
        int n = sc.nextInt();
        int power = powerPrint(x, n);
        System.out.println("The result of " + x + "^" + n + "is :" + power);
    }
}
