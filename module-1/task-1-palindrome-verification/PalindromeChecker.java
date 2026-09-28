public class PalindromeChecker {

    public static boolean isPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            // Skip spaces and special characters from the left
            if (!Character.isLetterOrDigit(input.charAt(left))) {
                left++;
                continue;
            }

            // Skip spaces and special characters from the right
            if (!Character.isLetterOrDigit(input.charAt(right))) {
                right--;
                continue;
            }

            char leftChar =
                    Character.toLowerCase(input.charAt(left));

            char rightChar =
                    Character.toLowerCase(input.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String test1 = "racecar";
        String test2 = "A man, a plan, a canal: Dominican Republic";
        String test3 = "hello";

        System.out.println(test1 + " -> " + isPalindrome(test1));
        System.out.println(test2 + " -> " + isPalindrome(test2));
        System.out.println(test3 + " -> " + isPalindrome(test3));
    }
}
