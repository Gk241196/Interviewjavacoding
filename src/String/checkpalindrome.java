package String;
public class checkpalindrome {
	    public static void main(String[] args) {
	        String str = "madam";
	        boolean isPalindrome = true;
	        // Check characters from start and end moving towards the center
	        for (int i = 0; i < str.length() / 2; i++) {
	            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
	                isPalindrome = false;
	                break;
	            }

				
	        }
	        System.out.println("Is Palindrome: " + isPalindrome);
	    }
	}


