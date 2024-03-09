import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("Yes, it's a palindrome!"+"->"+System.currentTimeMillis());
        } else {
            System.out.println("No, it's not a palindrome."+"->"+System.currentTimeMillis());
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();
        
        // Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        
        // Check if the string is equal to its reverse
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }
}