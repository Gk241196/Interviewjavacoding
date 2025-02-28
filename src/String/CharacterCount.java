package String;
import java.util.HashMap;
import java.util.Map;
public class CharacterCount {
    public static void main(String[] args) {
        String str = "Ganesh kumar Learning Automation";
        Map<Character, Integer> charCountMap = countEachCharacter(str);
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times");
        }
    }
    public static Map<Character, Integer> countEachCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        return charCountMap;
    }
}
