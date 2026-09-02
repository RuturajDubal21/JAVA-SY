import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        if (ascending) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }

        sc.close();
    }
}