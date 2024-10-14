public class Palindromestring
{
    public static void main(String[] args) 
{
        String str = "A man a plan a canal Panama"; 
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

      
        if (isPalindrome(cleanedStr)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

   
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
