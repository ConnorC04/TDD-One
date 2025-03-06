package rocks.zipcode;
/** 
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public static int countOccurrences(String str, char c) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }
    
    public static boolean isPalindrome(String str) {

        // Your implementation here
        String reversed = new StringBuilder(str).reverse().toString();
        String cleanReversed = reversed.replaceAll(",", "").replaceAll(":", "").replaceAll(" ", "").toLowerCase();
        return cleanReversed.equals(str);
        // Note: Ignoring case and non-alphanumeric characters
    }
}

