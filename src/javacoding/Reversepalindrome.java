package javacoding;

public class Reversepalindrome {
    public static void main(String[] args) {
        int num = 2408;
        int reversedNum = reverse(num);
        System.out.println("Reversed Number: " + reversedNum);
        System.out.println("Is Palindrome: " + isPalindrome(num));
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return originalNum == rev;
    }
}


