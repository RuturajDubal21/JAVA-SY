public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 67};

        // Assume the first element is the largest
        int largest = arr[0];

        // Compare each element with the current largest
        for (int i = 1; i < 6; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}