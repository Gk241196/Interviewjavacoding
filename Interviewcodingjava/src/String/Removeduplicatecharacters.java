package String;
public class Removeduplicatecharacters {
	    public static void main(String[] args) {
	        String str = "Ganesh Kumar";
	        StringBuilder uniqueStr = new StringBuilder();
	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            // Check if character is already present
	            if (uniqueStr.toString().indexOf(ch) == -1) {
	                uniqueStr.append(ch); // Append if not present
	            }
	        }
	      System.out.println("String after removing duplicates: " + uniqueStr);
	    }
	}

