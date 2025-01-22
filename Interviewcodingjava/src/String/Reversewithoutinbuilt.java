package String;
public class Reversewithoutinbuilt{
	    public static void main(String[] args) {
	        String str = "Ganesh Kumar is working in amazon";
	        String reversed = "";
	        // Loop through each character starting from the end
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i); // Append each character in reverse order
	        }
	        System.out.println("Reversed String: " + reversed);
	    }
	}



