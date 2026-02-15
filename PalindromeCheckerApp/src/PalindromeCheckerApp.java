/**
 * =============================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * =============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Prabhu.N
 * @version 9.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Optional: Normalize input (remove spaces & ignore case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base Condition 1: All characters checked
        if (start >= end) {
            return true;
        }

        // Base Condition 2: Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return check(s, start + 1, end - 1);
    }
}
