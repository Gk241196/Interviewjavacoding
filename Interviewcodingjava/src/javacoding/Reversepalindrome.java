//reverse and check palindrome of the number
package javacoding;
public class Reversepalindrome {
	public static void reverse() {
		int num = 2408; // The number to reverse
	    int rev = 0;    // This will store the reversed number
	    // Loop until all digits are processed
	    while (num > 0) {
	        rev = rev * 10 + num % 10; // Get the last digit and add it to rev
	        num = num / 10; // Remove the last digit from num
	    }
 System.out.println(rev); // Print the reversed numberSystem.out.println(rev);
	}
		public static void palindrome() {
			int num=2408;
			int temp=num;
			int rev=0;
			while(num>0) {
				int n=num%10;
				rev=rev * 10+num % 10;
				num/=10;
			}
		if(rev==temp) {
			System.out.println("Given number palindrome");
		}
			else {
			System.out.println("Given  number not palindrome");
		}
		}
	public static void main(String args[]) {
		Reversepalindrome.reverse();
		Reversepalindrome.palindrome();
	}
	}


