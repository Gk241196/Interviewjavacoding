package String;

public class Findoccurence {
    public static void main(String[] args) {
        String str = "Ganesh kumar Learning Automation";
        char ch = 'a';
        int count = countOccurrences(str, ch);
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
    }
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
