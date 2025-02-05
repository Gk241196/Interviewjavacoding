package String;
import java.util.HashMap;
public class Fetchinguniqueelements {
	    public static void main(String[] args) {
	        String input = "Ganesh Kumar";
	        StringBuilder uniqueCharacters = new StringBuilder();
	        HashMap<Character, Integer> frequencyMap = new HashMap<>();
	        // Populate frequency map
	        for (char ch : input.toCharArray()) {
	            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
	        }
	        // Find unique characters
	        for (char ch : input.toCharArray()) {
	            if (frequencyMap.get(ch) == 1) {
	                uniqueCharacters.append(ch);
	            }
	        }
	        System.out.println("Unique Characters: " + uniqueCharacters);
	    }
	}

