import java.util.Scanner;

public class b_Search {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // accending order
            // now we have to find the mid point. but for the bigger integer start + end
            // value may be bigger than integer range. That's why we will use different
            // formula to find mid value that is start + (end - start)/2;
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { -12, -5, -3, 1, 2, 5, 19, 23, 34, 66, 78, 97 };
        System.out.println("Enter The number you want to search");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);

        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
            
        } else {
            System.out.println("Element not found");
        }
    }
}