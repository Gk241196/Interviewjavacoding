package String;

public class Reversewords {
    public static void main(String[] args) {
        String sentence = "Ganesh kumar Learning Automation";
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
    }
}
