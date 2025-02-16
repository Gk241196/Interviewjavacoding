package String;

public class countcharacters {
    public static void main(String[] args) {
        String name = "Ganesh Kumar";
        System.out.println("Number of characters in string: " + name.length());
        System.out.println("Number of words in string: " + countWords(name));
    }

    public static int countWords(String str) {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(str.charAt(i)) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(str.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
}


