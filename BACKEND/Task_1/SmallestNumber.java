import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program finds the smallest number from a given list of integers.
 *
 * @version 1.0
 * @since 2023-04-28
 * @author Haitham Al Daajah
 */
public class SmallestNumber {
    /**
     * The main method that accepts user input and finds the smallest number.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int count = scanner.nextInt();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < count; i++) {
            // Read each element from the user and add it to the array
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Find the smallest number from the given list
        int smallestNumber = findSmallestNumber(numbers);

        // Print the smallest number
        System.out.println("The smallest number is " + smallestNumber);

        scanner.close();
    }
    
    /**
     * Finds the smallest number in a given list.
     *
     * @param numbers the list of integers
     * @return the smallest number in the list
     * @throws IllegalArgumentException if the list is null or empty
     */
    public static int findSmallestNumber(List<Integer> numbers) {
        // Check if the list is null or empty
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        // Pick the first element to be the smallest at first, then loop on the rest of the elements
        int smallest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);

            // If the current value is smaller, update the smallest to be the current value
            if (current < smallest) {
                smallest = current;
            }
        }

        return smallest;
    }
}
