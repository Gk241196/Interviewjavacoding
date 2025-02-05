package String;
public class Reversestring {
    public static void main(String[] args) {
        String name = "Ganesh Kumar";
        String reversed = reverse(name);
        System.out.println("Reversed String: " + reversed);
    }
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

