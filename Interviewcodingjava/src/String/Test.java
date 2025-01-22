package String;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
	public class Test {
	    public static void main(String[] args) {
	        String str = "This this is is done by Saket Saket";
	        // Convert the string to lowercase to handle case insensitivity
	        str = str.toLowerCase();

	        // Split the string into words and count their occurrences
	        Map<String, Long> wordCountMap = Arrays.stream(str.split("\\s+"))
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        System.out.println(wordCountMap);
	    }
	}


