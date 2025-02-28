package String;
import java.util.Arrays;
public class checkanagrams {
	    public static void main(String[] argg) {
	        String str1 = "listen";
	        String str2 = "silent";
	        // Check if sorted versions of the strings are equal
	        boolean isAnagram = isAnagram(str1, str2);
	        System.out.println("Are Anagrams: " + isAnagram);
	    }
	    public static boolean isAnagram(String str1, String str2) {
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        return Arrays.equals(arr1, arr2);
	    }
	}

