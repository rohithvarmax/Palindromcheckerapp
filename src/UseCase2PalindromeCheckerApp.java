public class UseCase2PalindromeCheckerApp {
}
/**
 * PalindromeChecker App
 * UC2: Print a Hardcoded Palindrome Result
 */


 class UseCase2PalindromeCheckerAp {

    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program exits automatically after main() ends
    }
}