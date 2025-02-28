package String;
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "Ganesh kumar";
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(name);
        if (firstNonRepeatingChar != 0) {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    public static char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
