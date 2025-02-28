package String;

public class OptimizedMethods {
    public static void main(String[] args) {
        String str = "Ganesh Kumar is working in Amazon";
        System.out.println("Reversed String: " + reverseString(str));
        System.out.println("Longest word in the sentence: " + findLongestWord(str));
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
