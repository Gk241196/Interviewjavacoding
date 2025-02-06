package String;

public class checkanagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are Anagrams: " + isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming the strings contain only lowercase letters

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

