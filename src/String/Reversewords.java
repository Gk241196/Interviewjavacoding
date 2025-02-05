package String;

public class Reversewords {
	public static void main(String[] args) {
		String sentence = "Ganesh kumar Learning Automation";
		String[] words = sentence.split(" ");
		String reversedSentence = "";
		// Reverse each word
		for (String word : words) {
			String reversedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord += word.charAt(i);
			}
			reversedSentence += reversedWord + " ";
		}
		System.out.println("Reversed Sentence: " + reversedSentence.trim());
	}
}
