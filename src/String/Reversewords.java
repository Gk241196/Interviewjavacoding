package String;

public class Reversewords {
    public static void main(String[] args) {
        String sentence = "Ganesh kumar Learning Automation";
        StringBuilder reversedSentence = new StringBuilder();
        int start = 0;

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--) {
                    reversedSentence.append(sentence.charAt(j));
                }
                if (i != sentence.length()) {
                    reversedSentence.append(" ");
                }
                start = i + 1;
            }
        }

        System.out.println("Reversed Sentence: " + reversedSentence.toString());
    }
}
