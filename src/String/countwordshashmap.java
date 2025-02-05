package String;
import java.util.HashMap;
public class countwordshashmap {
	    public static void main(String[] args) {
	        String str = "This this is is done by Saket Saket";
	        String[] words = str.split(" ");
	        HashMap<String, Integer> wordCountMap = new HashMap<>();
	        // Using a for-each loop to iterate over each word
	        for (String word : words) {
	            // Retrieve the current count of the word, defaulting to 0 if not present
	            int count = wordCountMap.getOrDefault(word, 0);
	            // Update the count for the word
	            wordCountMap.put(word, count + 1);
	        }

	        System.out.println(wordCountMap);
	    }
	}
	

