package String;

public class Basicstring {
    public static void main(String args[]) {
        String name = "Ganesh kumar";
        System.out.println("Given string in upper case as " + toUpperCase(name));
        System.out.println("Given string in lower case as " + toLowerCase(name));
        System.out.println("Finding character is " + name.charAt(5));
        System.out.println("Finding index is " + indexOf(name, "Ganesh"));
    }

    public static String toUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 'a' + 'A');
            }
        }
        return new String(chars);
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - 'A' + 'a');
            }
        }
        return new String(chars);
    }

    public static int indexOf(String str, String substr) {
        char[] strChars = str.toCharArray();
        char[] substrChars = substr.toCharArray();
        for (int i = 0; i <= strChars.length - substrChars.length; i++) {
            int j;
            for (j = 0; j < substrChars.length; j++) {
                if (strChars[i + j] != substrChars[j]) {
                    break;
                }
            }
            if (j == substrChars.length) {
                return i;
            }
        }
        return -1;
    }
}


