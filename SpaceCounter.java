import java.util.Scanner;

public class SpaceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int spaceCount = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of spaces in the string: " + spaceCount);
    }
}
