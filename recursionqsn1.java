import java.util.Scanner;

public class recursionqsn1 {
    public static int printSum(int n) {

        if (n == 0) {
            return 0;

        }
        return n + printSum(n - 1);
    }

    public static void main(String args[]) {
        // print sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of n: ");
        int n = sc.nextInt();
        int sum = printSum(n);
        System.out.println("The sum of " + n + " natural number is " + sum);

    }
}
