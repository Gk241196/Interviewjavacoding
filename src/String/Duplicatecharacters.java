package String;
import java.util.HashSet;

public class Duplicatecharacters {
    public static void main(String[] args) {
        String str = "Sakkett";
        char[] chars = str.toCharArray();
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> seen = new HashSet<>();

        for (char c : chars) {
            if (seen.contains(c)) {
                duplicates.add(c);
            } else {
                seen.add(c);
            }
        }

        System.out.println("Duplicate characters are: " + duplicates);
    }
}
